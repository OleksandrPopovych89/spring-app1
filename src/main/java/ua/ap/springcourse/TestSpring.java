package ua.ap.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music1 = context.getBean("rockMusic", RockMusic.class);
//        System.out.println(music1.getSong());
//
//        MusicPlayer player1 = new MusicPlayer(music1);
//        player1.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
//
//        MusicPlayer player2 = new MusicPlayer(music2);
//        player2.playMusic();
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);

        context.close();
    }
}