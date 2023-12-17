public class ClienteB implements Cliente {
    private FabricaX fabrica;

    public ClienteB() {
        FabricaXB fabrica = new FabricaXB(this);
        setFabrica(fabrica);
        fabrica.rutina1();
        fabrica.rutina2(1);
    }

    private void setFabrica(FabricaXB fabrica) {
        this.fabrica = fabrica;
    }
}
