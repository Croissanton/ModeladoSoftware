public class ClienteC implements Cliente {
    private FabricaX fabrica;

    public ClienteC() {
        FabricaXC fabrica = new FabricaXC(this);
        setFabrica(fabrica);
        fabrica.rutina1();
        fabrica.rutina3(1);
    }

    private void setFabrica(FabricaXC fabrica) {
        this.fabrica = fabrica;
    }
}
