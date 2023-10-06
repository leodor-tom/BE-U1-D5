import playerMultimediale.Image;
import playerMultimediale.Mp3;
import playerMultimediale.Mp4;

public class Main {
    public static void main(String[] args) {
        Image albero = new Image("albero", 3);
        Mp4 lotr = new Mp4("Il Signore degli Anelli", 6, 10, 5);
        Mp3 siamoSoloNoi = new Mp3("Siamo solo noi!", 3, 10);

        albero.show();
        lotr.play();
        siamoSoloNoi.play();
    }
}