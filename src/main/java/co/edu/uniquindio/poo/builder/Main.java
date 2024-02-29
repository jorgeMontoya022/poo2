package co.edu.uniquindio.poo.builder;

public class Main {
    public static void main(String[] args) {
        crearCliente();
    }

    private static void crearCliente(){
        var cliente = new Cliente("Jorge", "Montoya", "123456", 23, 62, 1.70f);

        var cliente2 = new Cliente("Juan", "Quiñones", "54321");

        var cliente3 = new Cliente();
        cliente3.setNombre("BLanca");
        
    }
}
