package playerMultimediale;

public class Mp3 extends basic implements Player {
    private int volume;
    private int duration;

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
        String output = this.title +
                "!".repeat(Math.max(0, this.volume));
        for (int i = 0; i < this.duration; i++) {
            System.out.println(output);
        }

    }
}
