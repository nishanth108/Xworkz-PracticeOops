package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Song;

public class SongRunner implements Song {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void playSong() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void stopSong() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void puase() {
        System.out.println("Pausing the Song");
    }
}
