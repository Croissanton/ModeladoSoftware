public abstract class Trabajador{
    private String nombre;
    private String numeroSeguridadSocial;
    private double salario;

    public double nomina(){
        return this.salario;
    }

    abstract public void incrementar();

    protected void setSalario(double salario){
        this.salario = salario;
    }
}
