import java.util.Queue;

public class Bandeja {
    private Queue<Pieza> piezas;
    private final int CAPACIDAD;
    private enum Estados {empty, normal, full};
    public Bandeja(int CAPACIDAD) {
        assert (CAPACIDAD > 0);
        this.CAPACIDAD = CAPACIDAD;
    }

    public void put(Pieza p) {
        assert (this.getEstado() != Estados.full);
        this.piezas.add(p);
    }

    public Pieza get() {
        assert (this.getEstado() != Estados.empty);
        return this.piezas.remove();
    }

    public int size() {
        return this.piezas.size();
    }

    private int getCAPACIDAD() {
        return this.CAPACIDAD;
    }

    private Queue<Pieza> getPiezas() {
        assert (this.getEstado() != Estados.empty);
        return this.piezas;
    }

    private Estados getEstado() {
        assert (this.size() <= this.CAPACIDAD);
        if (this.size() == 0) {
            return Estados.empty;
        } else if (this.size() == this.CAPACIDAD) {
            return Estados.full;
        } else {
            return Estados.normal;
        }
    }
}
