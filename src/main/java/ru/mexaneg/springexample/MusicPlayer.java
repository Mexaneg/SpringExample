package ru.mexaneg.springexample;

import java.util.*;

public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public void init(){
        System.out.println("Init Music player"+this.toString());
    }

    public void destroy(){
        System.out.println("Destroy Music player"+this.toString());
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        play("Player name:" + name + ", volume:" + volume);
        play("Playing music:");
        musicList.forEach(music -> play(music.getSong()));

    }

    private void play(String s) {
        System.out.println(s);
    }
}
