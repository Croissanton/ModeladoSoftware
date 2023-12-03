public class EmptyEstado implements BandejaEstado {
    @Override
    public void put(Bandeja bandeja, Pieza pieza) {
        bandeja.getPiezas().add(pieza);
        updateEstado(bandeja);
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        throw new IllegalStateException("No se puede obtener una pieza de una bandeja vacía.");
    }

    @Override
    public void updateEstado(Bandeja bandeja) {
        if (!bandeja.getPiezas().isEmpty()) {
            bandeja.setEstado(new NormalEstado());
        }
    }
}
