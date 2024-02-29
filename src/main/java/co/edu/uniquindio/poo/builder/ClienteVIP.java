package co.edu.uniquindio.poo.builder;

public class ClienteVIP extends Cliente {
    private String direccion;
    private EstadoCivil estadoCivil;
    private String correo;

    public ClienteVIP(String nombre, String apellido, String cedula, int edad, int peso, float estatura) {
        super(nombre, apellido, cedula, edad, peso, estatura);

    }

    public ClienteVIP(String nombre, String apellido, String cedula, String direccion, EstadoCivil estadoCivil,
            String correo) {
        super(nombre, apellido, cedula);
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.correo = correo;
    }

    public ClienteVIP() {

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}