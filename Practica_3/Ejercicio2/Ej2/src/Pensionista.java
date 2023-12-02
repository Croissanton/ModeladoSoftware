public class Pensionista extends Trabajador{

    public Pensionista(String nombre, String numeroSeguridadSocial, double salario) {
        super(nombre, numeroSeguridadSocial, salario);
    }

    @Override
    public void incrementar() {
        super.setSalario(super.nomina()*1.04);
    }
}
