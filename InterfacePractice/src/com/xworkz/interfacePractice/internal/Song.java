package com.xworkz.interfacePractice.internal;

public interface Song {
    void name();
    void playSong();
    void stopSong();
    default void puase() {
        System.out.println("puasing the song");
    }
}
