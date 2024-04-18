package br.com.VoicesInMyHead.MySongs.Main;

import br.com.VoicesInMyHead.MySongs.Models.Music;
import br.com.VoicesInMyHead.MySongs.Models.MyPreference;
import br.com.VoicesInMyHead.MySongs.Models.Podcast;

public class Main {
    public static void main(String[] args) {

        Music myMusic = new Music();
        myMusic.setTittle("Lovely");
        myMusic.setArtist("Billie Eilish");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTittle("Java POO");
        myPodcast.setHost("Renan Theobaldo");
        myPodcast.setDescription("Everything You Need To know About Java and POO");

        for (int i = 0; i < 3000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1500; i++) {
            myPodcast.like();
        }

        MyPreference preference = new MyPreference();
        preference.inclui(myPodcast);
        preference.inclui(myMusic);

    }
}
