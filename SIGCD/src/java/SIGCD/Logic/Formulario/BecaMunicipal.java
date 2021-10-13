package SIGCD.Logic.Formulario;

import java.sql.Timestamp;

public class BecaMunicipal extends Formulario {
    
    private int solicitante;
    private int estudiante;

    public BecaMunicipal() {
    }

    public BecaMunicipal(int IdFormulario, int estado, Timestamp fechaCreacion, int solicitante, int estudiante) {
        super(IdFormulario, estado, fechaCreacion);
        this.solicitante = solicitante;
        this.estudiante = estudiante;
    }

    public BecaMunicipal(int estado, Timestamp fechaCreacion, int solicitante, int estudiante) {
        super(estado, fechaCreacion);
        this.solicitante = solicitante;
        this.estudiante = estudiante;
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

    @Override
    public String toString() {
        return "BecaMunicipal{" + "solicitante=" + solicitante + ", estudiante=" + estudiante + '}';
    }
}
