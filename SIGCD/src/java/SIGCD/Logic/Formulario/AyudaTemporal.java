package SIGCD.Logic.Formulario;

import java.sql.Timestamp;

public class AyudaTemporal extends Formulario {

    private int solicitante;
    private String motivoAyuda;

    public AyudaTemporal() {
    }

    public AyudaTemporal(int IdFormulario, int estado, Timestamp fechaCreacion, int solicitante, String motivoAyuda) {
        super(IdFormulario, estado, fechaCreacion);
        this.solicitante = solicitante;
        this.motivoAyuda = motivoAyuda;
    }

    public AyudaTemporal(int estado, Timestamp fechaCreacion, int solicitante, String motivoAyuda) {
        super(estado, fechaCreacion);
        this.solicitante = solicitante;
        this.motivoAyuda = motivoAyuda;
    }

    public int getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(int solicitante) {
        this.solicitante = solicitante;
    }

    public String getMotivoAyuda() {
        return motivoAyuda;
    }

    public void setMotivoAyuda(String motivoAyuda) {
        this.motivoAyuda = motivoAyuda;
    }

    @Override
    public String toString() {
        return super.toString() + "AyudaTemporal{" + "solicitante=" + solicitante + ", motivoAyuda=" + motivoAyuda + '}';
    }
}
