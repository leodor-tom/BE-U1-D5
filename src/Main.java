import playerMultimediale.Image;
import playerMultimediale.Mp3;
import playerMultimediale.Mp4;
import playerMultimediale.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Player[] mediaItems = new Player[5];

        for (int i = 0; i < mediaItems.length; i++) {
            System.out.println("Which type of media do you want to create? (1:Image, 2:Mp3, 3:Mp4)");
            int type = Integer.parseInt(input.nextLine());
            input.nextLine();

            System.out.println("Enter the title:");
            String title = input.nextLine();

            switch (type) {
                case 1:
                    System.out.println("Enter the brightness:");
                    int brightness = Integer.parseInt(input.nextLine());
                    mediaItems[i] = new Image(title, brightness);
                    break;
                case 2:
                    System.out.println("Enter the duration:");
                    int duration = Integer.parseInt(input.nextLine());
                    System.out.println("enter the volume:");
                    int volume = Integer.parseInt(input.nextLine());
                    mediaItems[i] = new Mp3(title, duration, volume);
                    break;
                case 3:
                    System.out.println("Enter the duration:");
                    int durationMp4 = Integer.parseInt(input.nextLine());
                    System.out.println("Enter the volume:");
                    int volumeMp4 = Integer.parseInt(input.nextLine());
                    System.out.println("Enter the brightness:");
                    int brightnessMp4 = Integer.parseInt(input.nextLine());
                    mediaItems[i] = new Mp4(title, brightnessMp4, volumeMp4, durationMp4);
                    break;
                default:
                    System.err.println("Invalid type");
            }

        }

        while (true) {
            System.out.println("Enter a number from 1 to 5 to play a media item, or 0 to exit: ");
            int choice = Integer.parseInt(input.nextLine());

            if (choice == 0) {
                System.out.println("Adieu ShoShanna");
                break;
            } else if (choice >= 1 && choice <= 5) {
                mediaItems[choice - 1].play();
            } else {
                System.err.println("Invalid choice. Please try again.");
            }
        }
        
        input.close();


    }


}