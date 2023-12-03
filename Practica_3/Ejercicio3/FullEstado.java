public class FullEstado implements BandejaEstado {
    @Override
    public void put(Bandeja bandeja, Pieza pieza) {
        throw new IllegalStateException("No se puede poner una pieza en una bandeja llena.");
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        Pieza pieza = bandeja.getPiezas().remove();
        updateState(bandeja);
        return pieza;
    }

    @Override
    public void updateState(Bandeja bandeja) {
        if (bandeja.getPiezas().size() < bandeja.getCAPACIDAD()) {
            bandeja.setState(new NormalEstado());
        }
    }
}
