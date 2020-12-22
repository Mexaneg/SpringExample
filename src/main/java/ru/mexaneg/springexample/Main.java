package ru.mexaneg.springexample;

import org.springframework.context.support.*;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ElectroMusic electroMusic = applicationContext.getBean("electroMusicBean",ElectroMusic.class);
        ElectroMusic electroMusic2 = applicationContext.getBean("electroMusicBean",ElectroMusic.class);
        System.out.println(electroMusic.getSong());
        MusicPlayer firstPlayer = applicationContext.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondPlayer = applicationContext.getBean("musicPlayer",MusicPlayer.class);
        secondPlayer.setName("Second Player");
        firstPlayer.setVolume(10);
        firstPlayer.playMusic();
        secondPlayer.playMusic();

        System.out.println("compare players: "+(firstPlayer==secondPlayer));

        applicationContext.close();
    }
}
