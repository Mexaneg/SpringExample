package ru.mexaneg.springexample;

import java.util.*;

import org.springframework.stereotype.*;

@Component("electroMusic")
public class ElectroMusic implements Music{
    private ArrayList<String> musicList = new ArrayList<>();
    private ElectroMusic(){
        musicList.add("Euphoria");
        musicList.add("Midnight King");
        musicList.add("Only in my Dreams");
    }

    @Override
    public String getSong() {
        return "Euphoria";
    }

    public static ElectroMusic getMusic() {
        ElectroMusic music = new ElectroMusic();
        System.out.println(music.hashCode());
        return music;
    }

    public void doMyInit(){
        System.out.println("Doing ElectoMusic initialisation");
    }
    public void doMyDestroy(){
        System.out.println("Doing ElectoMusic destruction");
    }

}
