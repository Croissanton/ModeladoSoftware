package b;

public class Dispositivo {
    private Estado estado;
    private String tipo;
    public Dispositivo(String tipo) {
        assert (tipo.equals("Biestable") || tipo.equals("Triestable"));
        this.tipo = tipo;
        this.estado = new EstadoRojo();
    }
    private void setEstado(Estado estado) {
        this.estado = estado;
    }
    private void abrir() {
        setEstado(this.estado.abrir(this));
    }
    private void cerrar() {
        setEstado(this.estado.cerrar(this));
    }
    private String estado() {
        return this.estado.estado();
    }
    protected String getTipo() {
        return this.tipo;
    }
}
