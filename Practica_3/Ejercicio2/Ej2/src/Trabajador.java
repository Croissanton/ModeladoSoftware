public abstract class Trabajador{
    private String nombre;
    private String numeroSeguridadSocial;
    private double salario;

    public Trabajador(String nombre, String numeroSeguridadSocial, double salario) {
        assert (salario>0);
		assert (nombre!=null);
		assert (numeroSeguridadSocial!=null);
		this.nombre=nombre;
        this.numeroSeguridadSocial=numeroSeguridadSocial;
        setSalario(salario);
		
    }

    public double nomina(){
		
        return this.salario;
    }

    abstract public void incrementar();

    protected void setSalario(double salario){
        assert (salario>0);
        this.salario = salario;
    }

    protected String getNumeroSeguridadSocial() {
        return this.numeroSeguridadSocial;
    }

    protected String getNombre() {
        return this.nombre;
    }
}
