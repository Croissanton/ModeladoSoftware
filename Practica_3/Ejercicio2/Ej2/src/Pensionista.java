public class Pensionista extends Trabajador{

    @Override
    public void incrementar() {
        super.setSalario(super.nomina()*1.04);
    }
}
