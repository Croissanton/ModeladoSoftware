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

    protected Profesional getProfesional() {
        return this.profesional;
    }

    protected Expediente getExpediente() {
        return this.expediente;
    }

    protected Date getDate() {
        return this.fecha;
    }

    protected TipoAcceso getTipo() {
        return this.tipo;
    }

    private enum TipoAcceso {
        consulta, modificacion, creacion, archivo;
    }
}
