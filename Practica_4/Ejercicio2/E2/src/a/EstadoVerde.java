package a;

public class EstadoVerde implements Estado{
    @Override
    public Estado abrir() {
        throw new RuntimeException("Cambio de estado invalido.");
    }
    @Override
    public Estado cerrar() {
        return new EstadoRojo();
    }
    @Override
    public String estado() {
        return "Verde";
    }
}
