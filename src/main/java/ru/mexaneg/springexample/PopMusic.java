package ru.mexaneg.springexample;

public class PopMusic implements Music{
    private PopMusic(){}
    @Override
    public String getSong() {
        return "Калинка малинка";
    }

    public static PopMusic getMusic() {
        return new PopMusic();
    }
}