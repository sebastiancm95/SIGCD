package SIGCD.Logic.Persona;

import SIGCD.Logic.Direccion.Direccion;

public class Estudiante extends Solicitante {

    private int gradoAcademico;
    private int edad;
    private String fechaNacimiento;
    private Persona madre;
    private Persona padre;

    public Estudiante() {
    }

    public Estudiante(int gradoAcademico, int edad, String fechaNacimiento, Persona madre, Persona padre, String telefonotHabitacion, String telefonoCelular, Direccion direccion, int idPersona, String cedula, String nombre, String primerApellido, String segundoApellido) {
        super(telefonotHabitacion, telefonoCelular, direccion, idPersona, cedula, nombre, primerApellido, segundoApellido);
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

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "gradoAcademico=" + gradoAcademico + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", madre=" + madre + ", padre=" + padre + '}';
    }
}
