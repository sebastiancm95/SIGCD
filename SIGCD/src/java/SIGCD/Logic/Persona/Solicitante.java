package SIGCD.Logic.Persona;

import SIGCD.Logic.Direccion.Direccion;

public class Solicitante extends Persona {

    private String telefonoHabitacion;
    private String telefonoCelular;
    private Direccion direccion;

    public Solicitante() {
    }

    public Solicitante(int idPersona, String cedula, String nombre, String primerApellido, String segundoApellido, String telefonoHabitacion, String telefonoCelular, Direccion direccion) {
        super(idPersona, cedula, nombre, primerApellido, segundoApellido);
        this.telefonoHabitacion = telefonoHabitacion;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
    }

    public String getTelefonoHabitacion() {
        return telefonoHabitacion;
    }

    public void setTelefonoHabitacion(String telefonoHabitacion) {
        this.telefonoHabitacion = telefonoHabitacion;
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

    public String toString() {
        return super.toString() + "Solicitante{" + "telefonoHabitacion=" + telefonoHabitacion + ", telefonoCelular=" + telefonoCelular + ", direccion=" + direccion.toString() + '}';
    }
}
