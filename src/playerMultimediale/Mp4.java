package playerMultimediale;

public class Mp4 extends basic implements Player {
    private final int duration;
    private int brightness;
    private int volume;

    public Mp4(String title, int duration) {
        super(title);
        this.duration = duration;
        this.brightness = 5;
        this.volume = 5;
    }

    public Mp4(String title, int duration, int brightness) {
        super(title);
        this.duration = duration;
        this.brightness = brightness;
        this.volume = 5;
    }


    public Mp4(String title, int brightness, int volume, int duration) {
        super(title);
        this.brightness = brightness;
        this.volume = volume;
        this.duration = duration;

    }

    @Override
    public void play() {
        if (this.duration > 0 && this.brightness > 0) {
            String output = this.title +
                    "#".repeat(Math.max(0, this.brightness)) +
                    "!".repeat(Math.max(0, this.volume));
            for (int i = 0; i < this.duration; i++) {

                System.out.println(output);
            }
        } else System.err.println("You cannot play the video if it does not have a duration and brightness set");
    }

    public int increasesVol() {
        return ++this.volume;
    }

    public int decreasesVol() {
        return --this.volume;
    }

    public int increasesBrightness() {
        return ++this.brightness;
    }

    public int decreasesBrightness() {
        return --this.brightness;
    }

    public void getVolume() {
        System.out.println(this.volume);
    }

    public void getBrightness() {
        System.out.println(this.brightness);
    }

    public void getDuration() {
        System.out.println(this.duration);
    }
}
