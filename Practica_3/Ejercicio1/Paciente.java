import java.util.*;

public class Paciente {
    private final List<Expediente> expedientes;
    private Expediente expedienteAbierto;

    public Paciente(Expediente e) {
        assert e != null;

        this.expedientes = new ArrayList<Expediente>();
        this.addExpediente(e);
    }

    private void addExpediente(Expediente e) {
        assert e != null && expedienteAbierto == null;

        this.addExpediente(e);
        this.expedienteAbierto = e;
    }

    protected void closeExpedienteAbierto() {
        assert expedienteAbierto != null;

        this.expedienteAbierto = null;
    }

    protected Enumeration<Expediente> getExpedientes() {
        return Collections.enumeration(expedientes);
    }

    protected Expediente getExpedienteAbierto() {
        return expedienteAbierto;
    }

    protected boolean notDuplicatedExpediente() {
        Enumeration<Expediente> it1 = this.getExpedientes();
        Enumeration<Expediente> it2 = this.getExpedientes();

        while (it1.hasMoreElements()) {
            Expediente e1 = it1.nextElement();
            while (it2.hasMoreElements()) {
                Expediente e2 = it2.nextElement();
                if (e1 != e2 && e1 == e2) {
                    return false;
                }
            }
        }

        return true;
    }
}
