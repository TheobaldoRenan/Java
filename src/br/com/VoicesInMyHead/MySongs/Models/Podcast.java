package br.com.VoicesInMyHead.MySongs.Models;

public class Podcast extends Audio {
    private String host;
    private String invited;
    private String description;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getRate() {
        if (this.getAllLikes() > 1000){
            return 10;
        } else {
            return 8;
        }
    }
}
