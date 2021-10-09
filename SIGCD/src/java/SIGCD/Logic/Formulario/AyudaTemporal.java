package SIGCD.Logic.Formulario;

import SIGCD.Logic.Persona.Persona;
import SIGCD.Logic.Persona.Solicitante;
import java.sql.Timestamp;

public class AyudaTemporal extends Formulario {

    private Solicitante solicitante;
    private String motivoAyuda;

    public AyudaTemporal() {
    }

    public AyudaTemporal(Solicitante solicitante, String motivoAyuda, int IdFormulario, int estado, Persona persona, Timestamp fecha) {
        super(IdFormulario, estado, persona, fecha);
        this.solicitante = solicitante;
        this.motivoAyuda = motivoAyuda;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
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
        return "AyudaTemporal{" + "solicitante=" + solicitante + ", motivoAyuda=" + motivoAyuda + '}';
    }
}
