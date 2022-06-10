package ua.ap.springcourse.genres;

import ua.ap.springcourse.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JazzMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Sway";
    }
}
