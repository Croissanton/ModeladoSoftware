public class MedioPensionista extends Trabajador{
    private Activo activo;
    private Pensionista pensionista;

    public MedioPensionista(Activo activo, Pensionista pensionista){
        super(activo.getNombre(), activo.getNumeroSeguridadSocial(), activo.nomina()+pensionista.nomina());
        assert (activo.getNumeroSeguridadSocial().equals(pensionista.getNumeroSeguridadSocial()));
        this.activo = activo;
        this.pensionista = pensionista;
    }

    @Override
    public void incrementar() {
        this.activo.incrementar();
        this.pensionista.incrementar();
        this.setSalario(this.activo.nomina()+this.pensionista.nomina());
    }
}
