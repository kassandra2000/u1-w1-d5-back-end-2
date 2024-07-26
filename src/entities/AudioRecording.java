package entities;

public class AudioRecording extends MultimediaElement {
    public AudioRecording(int brightness, String title) {
        super(brightness, title);
    }

    public AudioRecording(String title, int volume, int duration, int brightness) {
        super(title, volume, duration, brightness);
    }

    public AudioRecording(String title, int volume, int duration) {
        super(title, volume, duration);
    }
}
