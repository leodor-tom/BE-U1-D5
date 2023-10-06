package playerMultimediale;

public class Mp4 extends basic implements Player {
    private int brightness;
    private int volume;

    private int duration;

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
        String output = this.title +
                "#".repeat(Math.max(0, this.brightness)) +
                "!".repeat(Math.max(0, this.volume));
        for (int i = 0; i < this.duration; i++) {

            System.out.println(output);
        }
    }
}
