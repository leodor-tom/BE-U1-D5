package playerMultimediale;

public class Mp3 extends basic implements Player {
    private final int duration;
    private int volume;

    public Mp3(String title, int duration) {
        super(title);
        this.duration = duration;
        this.volume = 5;
    }

    public Mp3(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    @Override
    public void play() {
        if (this.duration > 0) {
            String output = this.title +
                    "!".repeat(Math.max(0, this.volume));
            for (int i = 0; i < this.duration; i++) {
                System.out.println(output);
            }
        } else System.err.println("You cannot play the audio if it does not have a duration set.");

    }


    public int increasesVol() {
        return ++this.volume;
    }


    public int decreasesVol() {
        return --this.volume;
    }

    public void getDuration() {
        System.out.println(this.duration);
    }

    public void getVolume() {
        System.out.println(this.volume);
    }
}
