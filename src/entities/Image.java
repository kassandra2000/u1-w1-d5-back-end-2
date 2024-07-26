package entities;

public class Image extends MultimediaElement {
    public Image(int brightness, String title) {
        super(brightness, title);
    }

    public Image(String title, int volume, int duration, int brightness) {
        super(title, volume, duration, brightness);
    }

    public Image(String title, int volume, int duration) {
        super(title, volume, duration);
    }
}
