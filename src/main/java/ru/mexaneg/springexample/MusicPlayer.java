package ru.mexaneg.springexample;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing music: " + music.getSong());
    }
}