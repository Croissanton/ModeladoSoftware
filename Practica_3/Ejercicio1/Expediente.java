import java.util.*;

public class Expediente {
    private List<Acceso> acceso;

    public Expediente() {
        this.acceso = new ArrayList<Acceso>();
    }

    protected void addAcceso(Acceso a) {
        this.acceso.add(a);
    }

    protected void removeAcceso(Acceso a) {
        this.acceso.remove(a);
    }

    public Enumeration<Acceso> getAcceso() {
        return Collections.enumeration(acceso);
    }
}
