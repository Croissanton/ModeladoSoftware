import java.util.Set;

public class Bandeja {
    private Pieza[] piezas;
    private int numPiezas;
    private final int CAPACIDAD;
    
    public Bandeja(int CAPACIDAD) {
        assert CAPACIDAD > 0;
        this.CAPACIDAD = CAPACIDAD;
        this.piezas = new Pieza[this.CAPACIDAD];
        this.numPiezas = 0;
    }

    public void put(Pieza p) {
        assert this.numPiezas < this.CAPACIDAD;

        this.piezas[this.numPiezas] = p;
        this.numPiezas++;
    }

    public Pieza get() {
        assert this.numPiezas > 0;

        return this.piezas[--this.numPiezas];
    }

    public int size() {
        assert this.numPiezas >= 0;

        return this.numPiezas;
    }
}
