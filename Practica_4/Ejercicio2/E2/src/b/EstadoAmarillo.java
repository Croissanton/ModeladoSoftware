package b;

public class EstadoAmarillo implements Estado {
    @Override
    public Estado abrir(Dispositivo dispositivo) {
        assert (dispositivo.getTipo().equals("Triestable"));
        return new EstadoVerde();
    }
    @Override
    public Estado cerrar(Dispositivo dispositivo) {
        assert (dispositivo.getTipo().equals("Triestable"));
        return new EstadoRojo();
    }
    @Override
    public String estado() {
        return "Amarillo";
    }
}
