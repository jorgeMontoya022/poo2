package co.edu.uniquindio.poo.builder;

public class Cliente {
    private String nombre;
    private String apellido;
    private String Cedula;
    private int edad;
    private int peso;
    private float estatura;
    
    
    public Cliente(String nombre, String apellido, String cedula, int edad, int peso, float estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        Cedula = cedula;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        Cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
}
