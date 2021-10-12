package SIGCD.Logic.Persona;

import SIGCD.Logic.Direccion.Direccion;

public class Estudiante extends Solicitante {

    private int gradoAcademico;
    private int edad;
    private String fechaNacimiento;
    private String madre;
    private String padre;

    public Estudiante() {
    }

    public Estudiante(int idString, String cedula, String nombre, String primerApellido, String segundoApellido, String telefonoHabitacion, String telefonoCelular, Direccion direccion, int gradoAcademico, int edad, String fechaNacimiento, String madre, String padre) {
        super(idString, cedula, nombre, primerApellido, segundoApellido, telefonoHabitacion, telefonoCelular, direccion);
        this.gradoAcademico = gradoAcademico;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.madre = madre;
        this.padre = padre;
    }

    public int getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(int gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getMadre() {
        return madre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "gradoAcademico=" + gradoAcademico + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", madre=" + madre + ", padre=" + padre + '}';
    }
}
