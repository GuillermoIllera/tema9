package Model;

public class Cliente extends Persona{
    private int credito;

    public Cliente() {
    }

    public Cliente(String nombre, String telefono, int edad, int credito) {
        super(nombre, telefono, edad);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
