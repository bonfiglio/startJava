package us.phpnet.fabrizio.cap1_INTRO.cap99_DATABASE.db;


import java.io.*;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class ConnectDB {
        // init database constants
        private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
        private static final String DATABASE_URL = "jdbc:mysql://db4free.net:3306/dbrekse";
        private  static String username ;
        private  static String password ;
        private static final String MAX_POOL = "250"; // set your own limit

        private static final String jdbcURL = "jdbc:mysql://localhost/iscritticorsi?user=minty&password=greatsqldb";
        //private static Connection conn;
        // init connection object
        private static Connection conn;
        // init properties object
        private static Properties properties;
        // create properties
        private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   // System.out.print("Please enter user name :");

        private static Properties getProperties() {
            if (properties == null) {
                properties = new Properties();
                if(username==null||password==null){
                    try {
                        System.out.print("Please enter user name :");
                        username = br.readLine();
                        System.out.print("Please "+ username+ "  enter the password :");
                        password = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                properties.setProperty("user", username);
                properties.setProperty("password", password);
                properties.setProperty("MaxPooledStatements", MAX_POOL);
            }
            return properties;
        }

        // connect database
        public static Connection connect() {
            System.out.println("CONNESSIONE");
            if (conn == null) {
                try {
                  //  Class.forName(DATABASE_DRIVER);
                    conn = DriverManager.getConnection(DATABASE_URL, getProperties());
                } catch ( SQLException e) {
                    System.err.println("Errore connessione al DB");
                    throw new RuntimeException(e);
                }
            }
            return conn;
        }
        public static Connection getConnection() {
            try {

                if (conn == null || conn.isClosed()) {
                    conn = DriverManager.getConnection(jdbcURL);
                }

            } catch (SQLException e) {
                System.err.println("Errore connessione al DB");
                throw new RuntimeException(e);
            }
            return conn;
        }

        // disconnect database
        public void disconnect() {
            if (conn != null) {
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void importSQL(Connection conn, File inputFile) throws SQLException, FileNotFoundException {
            Scanner s = new Scanner(inputFile);
            s.useDelimiter("(;(\r)?\n)|(--\n)");
            Statement st = null;
            try
            {
                st = conn.createStatement();
                while (s.hasNext())
                {
                    String line = s.next();
                    if (line.startsWith("/*!") && line.endsWith("*/"))
                    {
                        int i = line.indexOf(' ');
                        line = line.substring(i + 1, line.length() - " */".length());
                    }

                    if (line.trim().length() > 0)
                    {
                        st.execute(line);
                    }
                }
            }
            finally
            {
                if (st != null) st.close();
            }
        }

        public static void test() {
// Testo connessione a data base
            String sql = "SELECT id, firstname , lastname FROM MyGuests" ;


            try {
                Connection conn = connect();

                PreparedStatement st = conn.prepareStatement(sql) ;

                ResultSet res = st.executeQuery() ;
                System.out.println(sql);
                while(res.next()) {
                    System.out.println("\t"+
                            res.getInt("id")+"\t"+
                            res.getString("firstname")+"\t"+
                            res.getString("lastname") ) ;


                }

                conn.close();

            } catch (SQLException e) {
                throw new RuntimeException(e) ;
            }


        }

    }

