import java.util.*;

public class Expediente {
    private List<Acceso> acceso;
    private Paciente paciente;

    public Expediente(Paciente p) {
        assert p != null;

        this.acceso = new ArrayList<Acceso>();
        this.paciente = p;

        assert p.notDuplicatedExpediente();
    }

    protected void addAcceso(Acceso a) {
        this.acceso.add(a);
    }

    protected void removeAcceso(Acceso a) {
        this.acceso.remove(a);
    }

    protected Paciente getPaciente() {
        return this.paciente;
    }

    public Enumeration<Acceso> getAcceso() {
        return Collections.enumeration(acceso);
    }
}
