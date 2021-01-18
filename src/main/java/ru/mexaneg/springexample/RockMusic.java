package ru.mexaneg.springexample;

import java.util.*;

import org.springframework.stereotype.*;

@Component("rockMusic")
public class RockMusic implements Music{
    private ArrayList<String> musicList = new ArrayList<>();
    private RockMusic(){
        musicList.add("Touch to much");
        musicList.add("Warriors of the World");
        musicList.add("Augen Auf");
    }
    @Override
    public String getSong() {
        return "Touch to much";
    }

    public static RockMusic getMusic() {
        return new RockMusic();
    }
}
