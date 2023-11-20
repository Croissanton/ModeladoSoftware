import java.util.Date;

public class Acceso {
    private Profesional profesional;
    private Expediente expediente;
    private Date fecha;
    private TipoAcceso tipo;

    public Acceso(Profesional p, Expediente e) {
        assert p != null && e != null;

        this.profesional = p;
        this.expediente = e;

        assert p.notDuplicatedAcceso();
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public Date getDate() {
        return fecha;
    }

    public TipoAcceso getTipo() {
        return tipo;
    }

    private enum TipoAcceso {
        CONSULTA, MODIFICACION, CREACION, ARCHIVO;
    }
}
