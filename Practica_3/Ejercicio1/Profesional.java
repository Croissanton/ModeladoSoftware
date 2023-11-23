import java.util.*;

public class Profesional {
    private List<Acceso> accesos;

    public Profesional() {
        accesos = new ArrayList<Acceso>();
    }

    protected void addAcceso(Acceso a) {
        accesos.add(a);
    }

    protected void removeAcceso(Acceso a) {
        accesos.remove(a);
    }

    protected Enumeration<Acceso> getAccesos() {
        return Collections.enumeration(accesos);
    }

    protected boolean notDuplicatedAcceso() {
        Enumeration<Acceso> it1 = this.getAccesos();
        Enumeration<Acceso> it2 = this.getAccesos();

        while (it1.hasMoreElements()) {
            Acceso a1 = it1.nextElement();
            while (it2.hasMoreElements()) {
                Acceso a2 = it2.nextElement();
                if (a1 != a2 && a1.getDate() == a2.getDate()) {
                    return false;
                }
            }
        }

        return true;
    }
}
