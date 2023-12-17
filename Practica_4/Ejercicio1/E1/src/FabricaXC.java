public class FabricaXC extends FabricaX {

    public FabricaXC(Cliente cliente) {
        super(cliente);
    }

    protected boolean rutina3(int i) {
        System.out.println("Rutina3");
        return true;
    }
}
