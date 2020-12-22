package ru.mexaneg.springexample;

public class RockMusic implements Music{
    private RockMusic(){
    }
    @Override
    public String getSong() {
        return "Touch to much";
    }

    public static RockMusic getMusic() {
        return new RockMusic();
    }
}
