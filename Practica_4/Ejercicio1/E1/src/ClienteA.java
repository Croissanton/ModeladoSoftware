public class ClienteA implements Cliente {

    public ClienteA() {
        FabricaXA fabrica = new FabricaXA();
        fabrica.rutina1();
        fabrica.rutina2(1);
        fabrica.rutina3(1);
    }
}
