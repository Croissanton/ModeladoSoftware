public class FabricaX {
    public FabricaX(Cliente cliente) {
        if (A) {
            FabricaX1 f = new FabricaX1(cliente);
            FabricaX2 f = new FabricaX2(cliente);
        } else if (B){
            FabricaX f = new FabricaX(cliente);
        } else {
            FabricaX2 f = new FabricaX2(cliente);
        }
    }

    public void rutina1() {
        System.out.println("Hello world!");
    }

    private int rutina4() {
        return 0;
    }


}
