package com.hungnt2004110032.buoi04;

public class Amoeba {
    String soundFile;

    public Amoeba(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Rotate 360 ...");
        this.playSound();
    }

    void playSound(){
        System.out.println("Play file " + soundFile + " music");
    }
}
