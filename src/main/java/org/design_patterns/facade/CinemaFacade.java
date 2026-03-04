package org.design_patterns.facade;

public class CinemaFacade {
    private Tv tv = new Tv();
    private Amplifier amplifier= new Amplifier();
    private DvdPlayer dvdPlayer= new DvdPlayer();
    private Lights lights= new Lights();

    //one simple method for client
    public void watchMovie(String movie){
        System.out.println("--- Cinema Preparation ---");
        lights.lower(30);
        tv.lightUp();
        tv.setHDMI(1);
        amplifier.lightUp();
        amplifier.setVolume(20);
        dvdPlayer.lightUp();
        dvdPlayer.insertDisc(movie);
        dvdPlayer.play();
    }

    public void turnOffCinema () {
        System.out.println("--- Extinction of cinema ---");
        tv.lightUp();
        amplifier.lightUp();
        dvdPlayer.lightUp();
    }
}
