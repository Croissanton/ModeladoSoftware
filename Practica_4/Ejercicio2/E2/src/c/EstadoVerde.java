package c;

public class EstadoVerde implements Estado {
    @Override
    public Estado abrir(Dispositivo dispositivo) {throw new RuntimeException("Cambio de estado invalido.");}
    @Override
    public Estado cerrar(Dispositivo dispositivo) {
        switch (dispositivo.getTipo()) {
            case "Biestable" -> {return new EstadoRojo();}
            case "Triestable" -> {return new EstadoAmarillo();}
            default -> {throw new RuntimeException("Tipo de dispositivo no reconocido");}
        }
    }
    @Override
    public String estado() {
        return "Verde";
    }
}
