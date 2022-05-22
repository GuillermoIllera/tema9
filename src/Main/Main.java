package Main;

import Model.Cliente;
import Model.Trabajador;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Cliente");
        cliente.setTelefono("648937009");
        cliente.setEdad(20);
        cliente.setCredito(5000);

        System.out.println(cliente.getCredito() + cliente.getEdad() + cliente.getNombre() + cliente.getTelefono());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(30);
        trabajador.setSalario(900);
        trabajador.setTelefono("839382732");
        trabajador.setNombre("Trabajador");
        System.out.println(trabajador.getEdad() + trabajador.getSalario() + trabajador.getNombre() + trabajador.getTelefono());

    }
}
