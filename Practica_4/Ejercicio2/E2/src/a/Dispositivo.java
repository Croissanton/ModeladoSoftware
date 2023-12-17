package a;

public class Dispositivo {
    private Estado estado;
    public Dispositivo() {
        this.estado = new EstadoRojo();
    }
    private void setEstado(Estado estado) {
        this.estado = estado;
    }
    private void abrir() {
        setEstado(this.estado.abrir());
    }
    private void cerrar() {
        setEstado(this.estado.cerrar());
    }
    private String estado() {
        return this.estado.estado();
    }
}
