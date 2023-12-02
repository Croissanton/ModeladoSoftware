public class Main {
    public static void main(String[] args) {
        Trabajador activo = new Activo("Juan", "1234569789", 1000);
        Trabajador pensionista = new Pensionista("Pedro", "9876954321", 1000);
        System.out.println("salario activo: " + activo.nomina());
        System.out.println("salario pensionista: " + pensionista.nomina());
        activo.incrementar();
        pensionista.incrementar();
        System.out.println("salario activo incrementado: " + activo.nomina());
        System.out.println("salario pensionista incrementado: " + pensionista.nomina());

        Trabajador medioPensionista = new MedioPensionista((Activo)activo, (Pensionista)pensionista);
        System.out.println("salario medio pensionista "+medioPensionista.nomina());
        medioPensionista.incrementar();
        System.out.println("salario medio pensionista incrementado "+medioPensionista.nomina());
    }
}