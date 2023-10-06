package playerMultimediale;

public class Image extends basic implements Player {
    private int brightness;

    public Image(String title) {
        super(title);
        this.brightness = 5;
    }

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    @Override
    public void play() {
        if (this.brightness > 0) {
            String output = this.title +
                    "#".repeat(Math.max(0, this.brightness));
            System.out.println(output);
        } else System.err.println("You cannot view the image if it does not have brightness set.");
    }

    public int increasesBrightness() {
        return ++this.brightness;
    }

    public int decreasesBrightness() {
        return --this.brightness;
    }

    public void getBrightness() {
        System.out.println(this.brightness);
    }
}
