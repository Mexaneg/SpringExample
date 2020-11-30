package ru.mexaneg.springexample;

import org.springframework.context.support.*;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = applicationContext.getBean("musicBean", Music.class);

        //MusicPlayer player = new MusicPlayer(music);
        MusicPlayer player = applicationContext.getBean(MusicPlayer.class, "musicPlayer");
        player.playMusic();

        applicationContext.close();
    }
}
