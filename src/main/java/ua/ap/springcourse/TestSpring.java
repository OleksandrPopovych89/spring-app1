package ua.ap.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.ap.springcourse.config.SpringConfig;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        context.close();
        context.close();
    }
}