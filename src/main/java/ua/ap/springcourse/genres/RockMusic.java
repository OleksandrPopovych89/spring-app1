package ua.ap.springcourse.genres;

import ua.ap.springcourse.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RockMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    public String getSong() {
        return "Wind cries Mary";
    }
}