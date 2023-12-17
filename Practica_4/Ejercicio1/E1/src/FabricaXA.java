public class FabricaXA extends FabricaX {

    public FabricaXA(Cliente cliente) {
        super(cliente);
    }

    protected void rutina2(double y) {
        System.out.println("Rutina2");
    }

    protected boolean rutina3(int i) {
        System.out.println("Rutina3");
        return true;
    }
}
