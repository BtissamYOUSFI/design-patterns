package org.design_patterns.facade;

public class DvdPlayer {
    public void lightUp()             { System.out.println("DVD up"); }
    public void insertDisc(String f){ System.out.println("Disc : " + f); }
    public void play()                { System.out.println("Lecture..."); }
}
