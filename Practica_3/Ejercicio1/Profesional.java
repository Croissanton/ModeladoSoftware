import java.util.Collections;

public class Profesional {
    private List<Acceso> acceso;

    public Profesional() {
        acceso = new ArrayList<Acceso>();
    }

    protected void addAcceso(Acceso a) {
        acceso.add(a);
    }

    protected void removeAcceso(Acceso a) {
        acceso.remove(a);
    }

    public Enumeration<Acceso> getAcceso() {
        return Collections.enumeration(acceso);
    }
}
