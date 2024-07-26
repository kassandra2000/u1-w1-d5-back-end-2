package entities;

import interfaces.Brightness;

public class Image extends MultimediaElement implements Brightness {
    public Image(int brightness, String title) {
        super(brightness, title);
    }


    @Override
    public void lowerBrightness() {
        
    }

    @Override
    public void turnUpBrightness() {

    }
}
