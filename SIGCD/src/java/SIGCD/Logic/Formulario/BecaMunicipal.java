package SIGCD.Logic.Formulario;

import java.sql.Timestamp;

public class BecaMunicipal extends Formulario {
    
    private int solicitante;
    private int estudiante;
    private int encargado;

    public BecaMunicipal() {
    }

    public BecaMunicipal(int IdFormulario, int estado, int solicitante, int estudiante, int encargado, Timestamp fechaCreacion) {
        super(IdFormulario, estado, fechaCreacion);
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.encargado = encargado;
    }

    public BecaMunicipal(int estado, int solicitante, int estudiante, int encargado,  Timestamp fechaCreacion) {
        super(estado, fechaCreacion);
        this.solicitante = solicitante;
        this.estudiante = estudiante;
        this.encargado = encargado;
    }

    public int getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(int estudiante) {
        this.estudiante = estudiante;
    }

    public int getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(int solicitante) {
        this.solicitante = solicitante;
    }

    public int getEncargado() {
        return encargado;
    }

    public void setEncargado(int encargado) {
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return "BecaMunicipal{" + "solicitante=" + solicitante + ", estudiante=" + estudiante + ", encargado=" + encargado + '}';
    } 
}
