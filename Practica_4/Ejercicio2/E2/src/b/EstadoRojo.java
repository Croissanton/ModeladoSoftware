package b;

public class EstadoRojo implements Estado {
    @Override
    public Estado abrir(Dispositivo dispositivo) {
        switch (dispositivo.getTipo()) {
            case "Biestable" -> {return new EstadoVerde();}
            case "Triestable" -> {return new EstadoAmarillo();}
            default -> {throw new RuntimeException("Tipo de dispositivo no reconocido");}
        }
    }
    @Override
    public Estado cerrar(Dispositivo dispositivo) {throw new RuntimeException("Cambio de estado invalido.");}
    @Override
    public String estado() {
        return "Rojo";
    }
}
