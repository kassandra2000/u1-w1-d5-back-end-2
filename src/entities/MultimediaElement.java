package entities;

import java.util.Scanner;

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
//metodo statico
    public static void AddMultimediaArray(MultimediaElement[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Scegli il tipo di file da inserire nel tuo player:");
            System.out.println(" 1. Immagine \n 2. Audio \n 3. Video");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("hai scelto un immagine");
                    System.out.println("Scegli un titolo:");
                    sc.nextLine();
                    String imageTitle = sc.nextLine();
                    System.out.println("Scegli la luminosità \n");
                    int imageBrightness = sc.nextInt();
                    arr[i] = new Image(imageBrightness, imageTitle);
                    break;
                case 2:
                    System.out.println("hai scelto un audio");
                    sc.nextLine();
                    System.out.println("Scegli un titolo ");
                    String audioTitle = sc.nextLine();
                    System.out.println("Scegli la durata");
                    int durationAudio = sc.nextInt();
                    System.out.println("Scegli il volume \n");
                    int volumeAudio = sc.nextInt();
                    arr[i] = new AudioRecording(audioTitle, volumeAudio, durationAudio);
                    break;
                case 3:
                    System.out.println("hai scelto un video");
                    sc.nextLine();
                    System.out.println("Scegli un titolo ");
                    String videoTitle = sc.nextLine();
                    System.out.println("Scegli la durata");
                    int durataVideo = sc.nextInt();
                    System.out.println("Scegli il volume");
                    int volumeVideo = sc.nextInt();
                    System.out.println("Scegli la luminosità \n");
                    int videoBrightness = sc.nextInt();
                    arr[i] = new Video(videoTitle, volumeVideo, durataVideo, videoBrightness);
                    break;
                default:
                    System.out.println("Scelta non valida, scelte possibile da 1 a 3");
                    i--;
                    break;

            }
        }


        while (true) {

            System.out.println("Scegli l'oggetto da eseguire:");
            System.out.println(STR."""
                     0. termina sessione\s
                     1. \{arr[0].getTitle()}\s
                     2. \{arr[1].getTitle()}\s
                     3. \{arr[2].getTitle()}\s
                     4. \{arr[3].getTitle()}\s
                     5. \{arr[4].getTitle()}\s
                     """);

            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("fine scelta");
                break;
            } else if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {
                if (arr[choice - 1] instanceof AudioRecording) {
                    System.out.println("sono un audio ");

                    System.out.println("1. aumenta volume \n 2. diminuisci volume \n 3. andare avanti");
                    sc.nextLine();
                    String choiceVolume = sc.nextLine();
                    switch (choiceVolume) {
                        case "1":
                            ((AudioRecording) arr[choice - 1]).turnUpTheVolume();
                            break;
                        case "2":
                            ((AudioRecording) arr[choice - 1]).turnDownTheVolume();
                            break;
                        case "3":
                            break;
                        case null:
                        default:
                            System.out.println("la scelta non è corretta");
                            break;
                    }
                    ((AudioRecording) arr[choice - 1]).play();
                    System.out.println("\n");
                } else if (arr[choice - 1] instanceof Video) {
                    System.out.println("sono un video");
                    System.out.println("1. aumenta volume \n 2. diminuisci volume \n 3. alza luninosità \n 4.diminuisci luninosità  \n 5. andare avanti");
                    sc.nextLine();
                    String choiceVolume = sc.nextLine();
                    switch (choiceVolume) {
                        case "1":
                            ((Video) arr[choice - 1]).turnUpTheVolume();
                            break;
                        case "2":
                            ((Video) arr[choice - 1]).turnDownTheVolume();
                            break;
                        case "3":
                            ((Video) arr[choice - 1]).turnUpBrightness();
                            break;
                        case "4":
                            ((Video) arr[choice - 1]).lowerBrightness();
                            break;
                        case "5":
                            break;
                        default:
                            System.out.println("la scelta non è corretta");
                            break;
                    }

                    ((Video) arr[choice - 1]).play();
                    System.out.println("\n");
                } else {
                    System.out.println("sono un immagine");
                    System.out.println("1. alza luninosità \n 2.diminuisci luninosità  \n 3. andare avanti");
                    sc.nextLine();
                    String choiceVolume = sc.nextLine();
                    switch (choiceVolume) {
                        case "1":
                            ((Image) arr[choice - 1]).turnUpBrightness();
                            break;
                        case "2":
                            ((Image) arr[choice - 1]).lowerBrightness();
                            break;
                        case "3":
                            break;
                        case null:
                        default:
                            System.out.println("la scelta non è corretta");
                            break;
                    }
                    ((Image) arr[choice - 1]).show();
                    System.out.println("\n");
                }
            } else {
                System.out.println("la scelta effettuata non è corretta");
            }
        }
        sc.close();
    }
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
