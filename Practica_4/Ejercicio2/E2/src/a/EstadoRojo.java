package a;

public class EstadoRojo implements Estado{
    @Override
    public Estado abrir() {return new EstadoVerde();}
    @Override
    public Estado cerrar() {throw new RuntimeException("Cambio de estado invalido.");}
    @Override
    public String estado() {
        return "Rojo";
    }
}
