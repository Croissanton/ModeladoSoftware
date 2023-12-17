package b;

public interface Estado {
    public Estado abrir(Dispositivo dispositivo);
    public Estado cerrar(Dispositivo dispositivo);
    public String estado();
}
