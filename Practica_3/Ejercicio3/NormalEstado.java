public class NormalEstado implements BandejaEstado {
    @Override
    public void put(Bandeja bandeja, Pieza pieza) {
        assert bandeja.getPiezas().size() < bandeja.getCAPACIDAD();
        bandeja.getPiezas().add(pieza);
        updateState(bandeja);
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        Pieza pieza = bandeja.getPiezas().remove();
        updateState(bandeja);
        return pieza;
    }

    @Override
    public void updateState(Bandeja bandeja) {
        if (bandeja.getPiezas().isEmpty()) {
            bandeja.setState(new EmptyEstado());
        } else if (bandeja.getPiezas().size() == bandeja.getCAPACIDAD()) {
            bandeja.setState(new FullEstado());
        }
    }
}
