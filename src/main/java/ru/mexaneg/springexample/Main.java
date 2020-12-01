package ru.mexaneg.springexample;

import org.springframework.context.support.*;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player = applicationContext.getBean(MusicPlayer.class, "musicPlayer");
        player.playMusic();

        applicationContext.close();
    }
}
