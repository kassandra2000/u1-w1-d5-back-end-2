package entities;

import interfaces.Brightness;
import interfaces.Play;
import interfaces.Volume;

public class Video extends MultimediaElement implements Play, Brightness, Volume {

    //costruttore
    public Video(String title, int volume, int duration, int brightness) {
        super(title, volume, duration, brightness);
    }

    //metodi interfacce
    @Override
    public void lowerBrightness() {

    }

    @Override
    public void turnUpBrightness() {

    }

    @Override
    public void play() {

    }

    @Override
    public void turnDownTheVolume() {

    }

    @Override
    public void turnUpTheVolume() {

    }
}
