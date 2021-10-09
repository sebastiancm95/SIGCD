package SIGCD.Logic.Formulario;

import SIGCD.Logic.Persona.Estudiante;
import java.sql.Timestamp;

public class BecaMunicipal extends Formulario {

    private Estudiante estudiante;

    public BecaMunicipal() {
    }

    public BecaMunicipal(int IdFormulario, int estado, Timestamp fechaCreacion, Estudiante estudiante) {
        super(IdFormulario, estado, fechaCreacion);
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
