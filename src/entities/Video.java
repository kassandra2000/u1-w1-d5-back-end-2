package entities;

import interfaces.Brightness;
import interfaces.Play;
import interfaces.Volume;

import java.util.Scanner;

public class Video extends MultimediaElement implements Play, Brightness, Volume {
    Scanner sc = new Scanner(System.in);

    //costruttore
    public Video(String title, int volume, int duration, int brightness) {
        super(title, volume, duration, brightness);
    }

    //metodi interfacce
    @Override
    public void lowerBrightness() {
        System.out.println("la tua luminosità è: " + this.getBrightness() + " di quanto vuoi abbassarla? ");
        setBrightness(this.getBrightness() - sc.nextInt());
        String brightness = "";
        for (int i = 0; i < this.getBrightness(); i++) {
            if (this.getBrightness() > 0) {
                brightness += "*";
            } else {
                System.out.println("la tua luminosità non può essere abbassata ulteriormente");
            }
        }
        System.out.println(this.getTitle() + brightness);

    }

    @Override
    public void turnUpBrightness() {

        System.out.println("la tua luminosità è: " + this.getBrightness() + " di quanto vuoi aumentarla? ");
        int valueBrightness = sc.nextInt();
        setBrightness(this.getBrightness() + valueBrightness);
        String brightness = "";
        for (int i = 0; i < this.getBrightness(); i++) {
            brightness += "*";
        }
        System.out.println(this.getTitle() + brightness);

    }

    @Override
    public void play() {
        System.out.println("la tua durata è: " + this.getDuration() + " e il tuo volume è: " + this.getVolume() + " la tua luminosità è: " + this.getBrightness());

        String setting = "";
        for (int j = 0; j < this.getVolume(); j++) {
            setting += "!";
        }
        for (int k = 0; k < this.getBrightness(); k++) {
            setting += "*";
        }
        for (int i = 0; i < this.getDuration(); i++) {
            System.out.println(this.getTitle() + setting);
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
