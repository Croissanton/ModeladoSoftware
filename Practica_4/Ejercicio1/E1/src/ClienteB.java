public class ClienteB implements Cliente {

    public ClienteB() {
        FabricaX2 fabrica = new FabricaX2();
        fabrica.rutina1();
        fabrica.rutina2(1);
    }
}
