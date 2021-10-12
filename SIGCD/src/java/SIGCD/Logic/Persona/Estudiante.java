package SIGCD.Logic.Persona;

public class Estudiante extends Persona {

    private int gradoAcademico;
    private int edad;
    private String fechaNacimiento;
    private Solicitante solicitante;
    private Persona encargado;

    public Estudiante() {
    }

    public Estudiante(int idPersona, String cedula, String nombre, String primerApellido, String segundoApellido, int gradoAcademico, int edad, String fechaNacimiento, Solicitante solicitante, Persona encargado) {
        super(idPersona, cedula, nombre, primerApellido, segundoApellido);
        this.gradoAcademico = gradoAcademico;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.solicitante = solicitante;
        this.encargado = encargado;
    }

    public Estudiante(String cedula, String nombre, String primerApellido, String segundoApellido, int gradoAcademico, int edad, String fechaNacimiento, Solicitante solicitante, Persona encargado) {
        super(cedula, nombre, primerApellido, segundoApellido);
        this.gradoAcademico = gradoAcademico;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.solicitante = solicitante;
        this.encargado = encargado;
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

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public Persona getEncargado() {
        return encargado;
    }

    public void setEncargado(Persona encargado) {
        this.encargado = encargado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "gradoAcademico=" + gradoAcademico + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", solicitante=" + solicitante + '}';
    }
}
