package SIGCD.Logic.Formulario;

import SIGCD.Logic.Direccion.Direccion;

public class Formulario {

    private String cedula;
    private String nombreCompleto;
    private Direccion direccion;
    private String telefonoHabitacion;
    private String telefonoCelular;
     
    public Formulario() {
    }

    public Formulario(String cedula, String nombreCompleto, Direccion direccion, String telefonoHabitacion, String telefonoCelular) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefonoHabitacion = telefonoHabitacion;
        this.telefonoCelular = telefonoCelular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
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
}
