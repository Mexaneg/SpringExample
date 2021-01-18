package ru.mexaneg.springexample;

import java.util.*;

import org.springframework.stereotype.*;

@Component("popMusic")
public class PopMusic implements Music{
    private ArrayList<String> musicList = new ArrayList<>();


    private PopMusic(){
        musicList.add("Калинка малинка");
        musicList.add("Вите надо выйти");
        musicList.add("Poker face");
    }
    @Override
    public String getSong() {
        return "Калинка малинка";
    }

    public static PopMusic getMusic() {
        return new PopMusic();
    }
}