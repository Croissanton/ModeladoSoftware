import java.util.*;

public class Paciente {
    private final List<Expediente> expedientes;
    private Expediente expedienteAbierto;

    public Paciente(Expediente e) {
        assert e != null;

        this.expedientes = new ArrayList<Expediente>();
        this.setExpedienteAbierto(e);
    }

    protected void setExpedienteAbierto(Expediente e) {
        assert e != null && expedienteAbierto == null;

        this.expedientes.add(e);
        this.expedienteAbierto = e;
    }

    protected void closeExpedienteAbierto() {
        assert expedienteAbierto != null;

        this.expedienteAbierto = null;
    }

    public Enumeration<Expediente> getExpedientes() {
        return Collections.enumeration(expedientes);
    }

    public Expediente getExpedienteAbierto() {
        return expedienteAbierto;
    }
}
