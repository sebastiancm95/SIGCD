package SIGCD.Logic.Persona;

import SIGCD.Logic.Direccion.Direccion;

public class Solicitante extends Persona {

    private int idSolicitante;
    private String telefonoHabitacion;
    private String telefonoCelular;
    private Direccion direccion;

    public Solicitante() {
    }

    public Solicitante(int idPersona, String cedula, String nombre, String primerApellido, String segundoApellido, int idSolicitante, String telefonoHabitacion, String telefonoCelular, Direccion direccion) {
        super(idPersona, cedula, nombre, primerApellido, segundoApellido);
        this.idSolicitante = idSolicitante;
        this.telefonoHabitacion = telefonoHabitacion;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
    }

    public Solicitante(String cedula, String nombre, String primerApellido, String segundoApellido, int idSolicitante, String telefonoHabitacion, String telefonoCelular, Direccion direccion) {
        super(cedula, nombre, primerApellido, segundoApellido);
        this.idSolicitante = idSolicitante;
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

    @Override
    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(int idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    @Override
    public String toString() {
        return "Solicitante{" + "idSolicitante=" + idSolicitante + ", telefonoHabitacion=" + telefonoHabitacion + ", telefonoCelular=" + telefonoCelular + ", direccion=" + direccion + '}';
    }
}
