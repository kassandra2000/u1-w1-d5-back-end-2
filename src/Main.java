import entities.AudioRecording;
import entities.Image;
import entities.MultimediaElement;
import entities.Video;

public class Main {


    public static void main(String[] args) {

        AudioRecording audio = new AudioRecording("sono un audio ", 5, 3);
//        audio.turnUpTheVolume();
//        audio.turnDownTheVolume();
//        audio.lowerBrightness();
//        audio.turnUpBrightness();
//        audio.play();

        Image img = new Image(3, "sono un immagine ");
//        img.lowerBrightness();
//        img.turnUpBrightness();
//        img.show();

        Video video = new Video("sono un video ", 3, 5, 2);
//        video.turnUpTheVolume();
//        video.turnDownTheVolume();
//        video.lowerBrightness();
//        video.turnUpBrightness();
//        video.play();

        MultimediaElement[] arr = new MultimediaElement[5];
        MultimediaElement.AddMultimediaArray(arr);

    }


}




