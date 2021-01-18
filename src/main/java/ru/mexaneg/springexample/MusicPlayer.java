package ru.mexaneg.springexample;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Scope("prototype")
@Component("musicPlayer")
@PropertySource("classpath:musicPlayer.properties")
public class MusicPlayer {
    private Music music1;
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("electroMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void init() {
        System.out.println("Init Music player" + this.toString());
    }

    public void destroy() {
        System.out.println("Destroy Music player" + this.toString());
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic(MusicTypes type) {
        return "Player name:" + name +
                ", volume: " + volume + " Playing music: " +
                music1.getSong()+", "+music2.getSong();
    }
}
