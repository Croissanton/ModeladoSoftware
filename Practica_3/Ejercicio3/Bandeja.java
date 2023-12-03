import java.util.LinkedList;
import java.util.Queue;

public class Bandeja {
    private Queue<Pieza> piezas = new LinkedList<>();
    private final int CAPACIDAD;
    private BandejaEstado estado;

    public Bandeja(int capacidad) {
        this.CAPACIDAD = capacidad;
        this.estado = new EmptyEstado();
    }

    public void put(Pieza p) {
        estado.put(this, p);
    }

    public Pieza get() {
        return estado.get(this);
    }

    protected void setEstado(BandejaEstado estado) {
        this.estado = estado;
    }
    protected BandejaEstado getEstado() {
        return estado;
    }

    protected Queue<Pieza> getPiezas() {
        return piezas;
    }

    protected int getCAPACIDAD() {
        return CAPACIDAD;
    }
}

