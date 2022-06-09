package ua.ap.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();


    {
        songs.add("Hungarian Rhapsody");
        songs.add("O Fortune");
        songs.add("Moonlight Sonata");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
