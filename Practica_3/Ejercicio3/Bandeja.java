public class Bandeja {
    private Pieza[] piezas;
    private int numPiezas;
    private final int CAPACIDAD;
    private enum Estados {empty, normal, full};
    public Bandeja(int CAPACIDAD) {
        assert CAPACIDAD > 0;
        this.CAPACIDAD = CAPACIDAD;
        this.piezas = new Pieza[this.CAPACIDAD];
        this.numPiezas = 0;
    }

    public void put(Pieza p) {
        assert this.getEstado() != Estados.full;
        this.piezas[this.numPiezas] = p;
        this.numPiezas++;
    }

    public Pieza get() {
        assert this.getEstado() != Estados.empty;
        return this.piezas[--this.numPiezas];
    }

    public int size() {
        return this.numPiezas;
    }

    private int getCAPACIDAD() {
        return this.CAPACIDAD;
    }

    private Pieza[] getPiezas() {
        assert this.getEstado() != Estados.empty;
        return this.piezas;
    }

    private Estados getEstado() {
        if (this.numPiezas == 0) {
            return Estados.empty;
        } else if (this.numPiezas == this.CAPACIDAD) {
            return Estados.full;
        } else {
            return Estados.normal;
        }
    }
}
