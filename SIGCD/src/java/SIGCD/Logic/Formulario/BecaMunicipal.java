package SIGCD.Logic.Formulario;

import SIGCD.Logic.Direccion.Direccion;

public class BecaMunicipal extends Formulario {

    private String fechaNacimiento;
    private String gradoCursando;
    private int edad;
    private String nombreMadre;
    private String cedulaMadre;
    private String nombrePadre;
    private String cedulaPadre;

    public BecaMunicipal() {
    }

    public BecaMunicipal(String cedula, String nombreCompleto, Direccion direccion, String telefonoHabitacion, String telefonoCelular, String fechaNacimiento, String gradoCursando, int edad, String nombreMadre, String cedulaMadre, String nombrePadre, String cedulaPadre) {
        super(cedula, nombreCompleto, direccion, telefonoHabitacion, telefonoCelular);
        this.fechaNacimiento = fechaNacimiento;
        this.gradoCursando = gradoCursando;
        this.edad = edad;
        this.nombreMadre = nombreMadre;
        this.cedulaMadre = cedulaMadre;
        this.nombrePadre = nombrePadre;
        this.cedulaPadre = cedulaPadre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGradoCursando() {
        return gradoCursando;
    }

    public void setGradoCursando(String gradoCursando) {
        this.gradoCursando = gradoCursando;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getCedulaMadre() {
        return cedulaMadre;
    }

    public void setCedulaMadre(String cedulaMadre) {
        this.cedulaMadre = cedulaMadre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getCedulaPadre() {
        return cedulaPadre;
    }

    public void setCedulaPadre(String cedulaPadre) {
        this.cedulaPadre = cedulaPadre;
    }

    @Override
    public String toString() {
        return "BecaMunicipal{" + "fechaNacimiento=" + fechaNacimiento + ", gradoCursando=" + gradoCursando + ", edad=" + edad + ", nombreMadre=" + nombreMadre + ", cedulaMadre=" + cedulaMadre + ", nombrePadre=" + nombrePadre + ", cedulaPadre=" + cedulaPadre + '}';
    }
}
