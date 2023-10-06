package playerMultimediale;

public class Image extends basic implements Shower {
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
    public void show() {
        String output = this.title +
                "#".repeat(Math.max(0, this.brightness));
        System.out.println(output);
    }
}
