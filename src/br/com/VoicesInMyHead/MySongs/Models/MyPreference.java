package br.com.VoicesInMyHead.MySongs.Models;

public class MyPreference {

    public void inclui (Audio audio) {
        if (audio.getRate() >= 9 ) {
            System.out.println(audio.getTittle() + " - É um sucesso ");
        } else {
            System.out.println(audio.getTittle() + " - Tendência de sucesso ");
        }
    }





}
