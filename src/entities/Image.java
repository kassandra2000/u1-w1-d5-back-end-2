package entities;

import interfaces.Brightness;

import java.util.Scanner;


public class Image extends MultimediaElement implements Brightness {
    Scanner sc = new Scanner(System.in);

    //costruttore
    public Image(int brightness, String title) {
        super(brightness, title);
    }

    //metodi
    public void show() {
        System.out.println("la tua luminosità è: " + this.getBrightness());

        String brightness = "";
        for (int i = 0; i < this.getBrightness(); i++) {
            brightness += "*";
        }

        System.out.println(this.getTitle() + brightness);

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
}
