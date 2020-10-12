package ru.mexaneg.springexample;

import org.springframework.context.support.*;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = applicationContext.getBean("musicBean", Music.class);

        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();

        applicationContext.close();
    }
}
