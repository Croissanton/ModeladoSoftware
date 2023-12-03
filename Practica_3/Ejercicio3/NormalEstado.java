public class NormalEstado implements BandejaEstado {
    @Override
    public void put(Bandeja bandeja, Pieza pieza) {
        assert bandeja.getPiezas().size() < bandeja.getCAPACIDAD();
        bandeja.getPiezas().add(pieza);
        updateEstado(bandeja);
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        Pieza pieza = bandeja.getPiezas().remove();
        updateEstado(bandeja);
        return pieza;
    }

    @Override
    public void updateEstado(Bandeja bandeja) {
        if (bandeja.getPiezas().isEmpty()) {
            bandeja.setEstado(new EmptyEstado());
        } else if (bandeja.getPiezas().size() == bandeja.getCAPACIDAD()) {
            bandeja.setEstado(new FullEstado());
        }
    }
}
