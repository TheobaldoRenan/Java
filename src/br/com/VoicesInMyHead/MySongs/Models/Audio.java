package br.com.VoicesInMyHead.MySongs.Models;

public class Audio {
    private String tittle;
    private int duration;
    private int allReproductions;
    private int allLikes;
    private int rate;


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getAllReproductions() {
        return allReproductions;
    }

    public int getAllLikes() {
        return allLikes;
    }

    public int getRate() {
        return rate;
    }

    public void like(){
        this.allLikes++;
    }

    public void play(){
        this.allReproductions++;
    }

}
