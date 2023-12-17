public class ClienteA implements Cliente {
    private FabricaX fabrica;

    public ClienteA() {
        FabricaXA fabrica = new FabricaXA(this);
        setFabrica(fabrica);
        fabrica.rutina1();
        fabrica.rutina2(1);
        fabrica.rutina3(1);
    }

    private void setFabrica(FabricaXA fabrica) {
        this.fabrica = fabrica;
    }
}
