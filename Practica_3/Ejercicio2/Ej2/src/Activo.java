public class Activo extends Trabajador{

    @Override
    public void incrementar() {
        super.setSalario(super.nomina()*1.02);
    }
}
