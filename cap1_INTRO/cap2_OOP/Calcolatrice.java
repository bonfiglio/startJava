package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP;


public class Calcolatrice {
    Number result;

    public Calcolatrice() {
        this.result = 0;
    }

    public void operate (String operator, Number num1) {
        //Make it better! Give a better solution for operate(String, Number)
        Number result = 0;
        switch (operator) {

            case "sin": {
                result = Math.sin(Math.toRadians(num1.doubleValue()));
                break;
            }
            case "cos": {
                result = Math.cos(Math.toRadians(num1.doubleValue()));
                break;
            }
            case "tan": {
                result = Math.tan(Math.toRadians(num1.doubleValue()));
                break;
            }
            case "+": {
                result = this.result.doubleValue() + num1.doubleValue();
                break;
            }
            case "-": {
                result = this.result.doubleValue() - num1.doubleValue();
                break;
            }
            case "/": {
                result = this.result.doubleValue() / num1.doubleValue();
                break;
            }
            case "*": {
                result = this.result.doubleValue() * num1.doubleValue();
                break;
            }
            default: {
                result = num1;
            }
        }
        System.out.println(this.result.doubleValue() + " " + operator + " " + num1.doubleValue() + " = " + result.doubleValue());
        this.result = result;
    }

    public void operate (String operator) {

        //Complete the missing implementation
        switch (operator) {
            case "C": {
                this.result = 0;
                break;
            }
            case "e": {
                this.result = Math.E;
                break;
            }
            default: {
                break;
            }
        }
        //this.result = newValue
        System.out.println(this.result.doubleValue());
    }

    public void firstValue(Number num1) {
        this.result = num1;
    }

}