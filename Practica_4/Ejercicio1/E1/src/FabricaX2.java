public class FabricaX2 extends FabricaX {
    public FabricaX2(Cliente cliente) {
        super(cliente);
    }

    protected boolean rutina3(int i) {
        System.out.println("Rutina3");
        return true;
    }
}
