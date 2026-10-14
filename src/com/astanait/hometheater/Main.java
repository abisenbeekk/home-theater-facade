package com.astanait.hometheater;

import com.astanait.hometheater.facade.HomeTheaterFacade;
import com.astanait.hometheater.subsystem.*;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player");
        Projector projector = new Projector("Top-O-Line Projector");
        Screen screen = new Screen("Theater Screen");
        Lights lights = new Lights("Theater Lights");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amp, dvd, projector, screen, lights, popper
        );

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}