package ru.mexaneg.springexample;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class Computer {
    private int id;
    private MusicPlayer player;
    @Autowired
    public Computer(MusicPlayer player) {
        this.id=1;
        this.player = player;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", "+ player.playMusic();
    }
}
