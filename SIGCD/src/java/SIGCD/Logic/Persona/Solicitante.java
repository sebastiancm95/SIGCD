package SIGCD.Logic.Persona;

import SIGCD.Logic.Direccion.Direccion;

public class Solicitante extends Persona {

    private String telefonotHabitacion;
    private String telefonoCelular;
    private Direccion direccion;

    public Solicitante() {
    }

    public Solicitante(String telefonotHabitacion, String telefonoCelular, Direccion direccion, int idPersona, String cedula, String nombre, String primerApellido, String segundoApellido) {
        super(idPersona, cedula, nombre, primerApellido, segundoApellido);
        this.telefonotHabitacion = telefonotHabitacion;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
    }

    public String getTelefonotHabitacion() {
        return telefonotHabitacion;
    }

    public void setTelefonotHabitacion(String telefonotHabitacion) {
        this.telefonotHabitacion = telefonotHabitacion;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Solicitante{" + "telefonotHabitacion=" + telefonotHabitacion + ", telefonoCelular=" + telefonoCelular + ", direccion=" + direccion + '}';
    }
}
