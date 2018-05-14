package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.band;

public interface Suona{
    public default void PlaySong(String songName){
        System.out.println("Playing " + songName);
    }
}