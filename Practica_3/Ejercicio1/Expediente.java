import java.util.*;

public class Expediente {
    private List<Acceso> accesos;
    private Paciente paciente;

    public Expediente(Paciente p) {
        assert p != null;

        this.accesos = new ArrayList<Acceso>();
        this.paciente = p;

        assert p.notDuplicatedExpediente();
    }

    protected void addAcceso(Acceso a) {
        this.accesos.add(a);
    }

    protected void removeAcceso(Acceso a) {
        this.accesos.remove(a);
    }

    protected Paciente getPaciente() {
        return this.paciente;
    }

    public Enumeration<Acceso> getAccesos() {
        return Collections.enumeration(accesos);
    }
}
