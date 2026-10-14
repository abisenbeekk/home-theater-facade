package com.astanait.hometheater.facade;

import com.astanait.hometheater.subsystem.*;

public class HomeTheaterFacade {
    private final Amplifier amp;
    private final DvdPlayer dvd;
    private final Projector projector;
    private final Screen screen;
    private final Lights lights;
    private final PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd,
                             Projector projector, Screen screen,
                             Lights lights, PopcornPopper popper) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("\n=== Get ready to watch a movie: " + movie + " ===");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
        System.out.println("=== Ready! Enjoy the movie! ===\n");
    }

    public void endMovie() {
        System.out.println("\n=== Shutting movie theater down ===");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.off();
        System.out.println("=== Home theater is off ===\n");
    }
}