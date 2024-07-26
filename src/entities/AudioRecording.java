package entities;

import interfaces.Play;
import interfaces.Volume;

import java.util.Scanner;

public class AudioRecording extends MultimediaElement implements Volume, Play {
    Scanner sc = new Scanner(System.in);

    //costruttore
    public AudioRecording(String title, int volume, int duration) {
        super(title, volume, duration);
    }

    //metodi
    //metodi interfacce
    @Override
    public void play() {
        System.out.println("la tua durata è: " + this.getDuration() + " e il tuo volume è: " + this.getVolume());

        String volume = "";
        for (int j = 0; j < this.getVolume(); j++) {
            volume += "!";
        }
        for (int i = 0; i < this.getDuration(); i++) {
            System.out.println(this.getTitle() + volume);
        }

    }

    @Override
    public void turnDownTheVolume() {
        System.out.println("il tuo volume è: " + this.getVolume() + " di quanto vuoi abbassarlo? ");
        setVolume(this.getVolume() - sc.nextInt());
        String volume = "";
        for (int i = 0; i < this.getVolume(); i++) {
            if (this.getVolume() > 0) {
                volume += "!";
            } else {
                System.out.println("il tuo volume non può essere abbassato ulteriormente");
            }
        }
        System.out.println(this.getTitle() + volume);
    }

    @Override
    public void turnUpTheVolume() {
        System.out.println("il tuo volume è: " + this.getVolume() + " di quanto vuoi aumentarlo? ");
        int valueVolume = sc.nextInt();
        setVolume(this.getVolume() + valueVolume);
        String volume = "";
        for (int i = 0; i < this.getVolume(); i++) {
            volume += "!";
        }
        System.out.println(this.getTitle() + volume);
    }


}
