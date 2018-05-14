package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.band;

public interface Guitarist extends Suona{
    public default void playFavoriteSong(){
        System.out.println("Playing my favorite song");
        PlaySong("My first song");
    }
}