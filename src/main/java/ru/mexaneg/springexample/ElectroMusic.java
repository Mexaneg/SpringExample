package ru.mexaneg.springexample;

public class ElectroMusic implements Music{
    private ElectroMusic(){
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
