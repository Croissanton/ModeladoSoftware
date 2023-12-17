import java.util.List;

public abstract class FabricaX {
    private List<Cliente> clientes;

    public FabricaX(Cliente cliente) {
        addCliente(cliente);
    }

    public void rutina1() {
        System.out.println("Rutina1");
    }

    private int rutina4() {
        System.out.println("Rutina4");
        return 0;
    }

    private void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
