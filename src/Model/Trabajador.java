package Model;

public class Trabajador extends Persona{

    private int salario;

    public Trabajador() {
    }

    public Trabajador(String nombre, String telefono, int edad) {
        super(nombre, telefono, edad);
    }

    public Trabajador(String nombre, String telefono, int edad, int salario){
        super(nombre, telefono, edad);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
