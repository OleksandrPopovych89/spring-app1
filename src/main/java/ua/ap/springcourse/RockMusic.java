package ua.ap.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("Bohemian Rhapsody");
        songs.add("Don`t Stop Me Now");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
