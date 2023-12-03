public class Pieza {
    private Bandeja bandeja;

    public Pieza() {
    }

    public Pieza(Bandeja bandeja) {
        setBandeja(bandeja);
    }

    public Bandeja getBandeja() {
        return this.bandeja;
    }

    protected void setBandeja(Bandeja bandeja) {
        assert (bandeja != null);
        this.bandeja = bandeja;
    }
}