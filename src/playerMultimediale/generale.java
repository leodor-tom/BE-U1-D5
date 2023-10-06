package playerMultimediale;

public abstract class generale {
    protected Formato formato;
    protected String title;

    public generale(String title, Formato formato) {
        this.title = title;
        this.formato = formato;
    }
}
