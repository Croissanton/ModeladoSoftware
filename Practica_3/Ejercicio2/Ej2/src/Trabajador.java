public abstract class Trabajador{
    private String nombre;
    private String numeroSeguridadSocial;
    private double salario;

    public Trabajador(String nombre, String numeroSeguridadSocial, double salario) {
        this.nombre=nombre;
        this.numeroSeguridadSocial=numeroSeguridadSocial;
        this.salario=salario;
    }

    public double nomina(){
        return this.salario;
    }

    abstract public void incrementar();

    protected void setSalario(double salario){
        this.salario = salario;
    }

    protected String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    protected String getNombre() {
        return nombre;
    }
}
