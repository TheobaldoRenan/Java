package br.com.VoicesInMyHead.MySongs.Models;

public class Music extends Audio {
    private String artist;
    private String album;
    private String gender;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getRate() {
        if (this.getAllReproductions() > 2000){
            return 10;
        }else {
            return 7;
        }
    }
}
