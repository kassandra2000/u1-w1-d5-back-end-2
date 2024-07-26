package entities;

public class Video extends MultimediaElement {
    public Video(int brightness, String title) {
        super(brightness, title);
    }

    public Video(String title, int volume, int duration, int brightness) {
        super(title, volume, duration, brightness);
    }

    public Video(String title, int volume, int duration) {
        super(title, volume, duration);
    }
}
