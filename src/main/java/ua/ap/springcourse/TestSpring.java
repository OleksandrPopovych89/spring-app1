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

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic(MusicGenre.CLASSICAL);
//        musicPlayer.playMusic(MusicGenre.ROCK);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

//        System.out.println(classicalMusic1 == classicalMusic2);


        context.close();
    }
}