package entities;

import interfaces.Brightness;

public class AudioRecording extends MultimediaElement implements Brightness {

    //costruttore
    public AudioRecording(String title, int volume, int duration) {
        super(title, volume, duration);
    }

    //metodi interfacce
    @Override
    public void lowerBrightness() {
    }

    @Override
    public void turnUpBrightness() {
    }
}
