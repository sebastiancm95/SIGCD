package SIGCD.Logic.Formulario;

import SIGCD.Logic.Persona.Estudiante;
import SIGCD.Logic.Persona.Persona;
import java.sql.Timestamp;

public class BecaMunicipal extends Formulario {

    private Estudiante estudiante;

    public BecaMunicipal() {
    }

    public BecaMunicipal(Estudiante estudiante, int IdFormulario, int estado, Persona persona, Timestamp fechaCreacion) {
        super(IdFormulario, estado, persona, fechaCreacion);
        this.estudiante = estudiante;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "BecaMunicipal{" + "estudiante=" + estudiante + '}';
    }
}
