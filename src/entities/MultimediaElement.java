package entities;

public class MultimediaElement {

    //parametri
    private final String title;
    private int brightness;
    private int volume;
    private int duration;

    //costruttore

    public MultimediaElement(int brightness, String title) {
        this.brightness = brightness;
        this.title = title;
    }

    public MultimediaElement(String title, int volume, int duration, int brightness) {
        this.title = title;
        this.volume = volume;
        this.duration = duration;
        this.brightness = brightness;
    }

    public MultimediaElement(String title, int volume, int duration) {
        this.title = title;
        this.volume = volume;
        this.duration = duration;
    }

    //metodi

    //getter e setter


    public String getTitle() {
        return title;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
