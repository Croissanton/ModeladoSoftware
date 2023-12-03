import java.util.LinkedList;
import java.util.Queue;

public class Bandeja {
    private Queue<Pieza> piezas = new LinkedList<>();
    private final int CAPACIDAD;
    private BandejaEstado state;

    public Bandeja(int capacidad) {
        this.CAPACIDAD = capacidad;
        this.state = new EmptyEstado();
    }

    public void put(Pieza p) {
        state.put(this, p);
    }

    public Pieza get() {
        return state.get(this);
    }

    protected void setState(BandejaEstado state) {
        this.state = state;
    }

    protected Queue<Pieza> getPiezas() {
        return piezas;
    }

    protected int getCAPACIDAD() {
        return CAPACIDAD;
    }
}

