package SIGCD.Logic.Formulario;

import java.sql.Timestamp;

public class BecaMunicipal extends Formulario {

    private int estudiante;

    public BecaMunicipal() {
    }

    public BecaMunicipal(int IdFormulario, int estado, Timestamp fechaCreacion, int estudiante) {
        super(IdFormulario, estado, fechaCreacion);
        this.estudiante = estudiante;
    }

    public BecaMunicipal(int estado, Timestamp fechaCreacion, int estudiante) {
        super(estado, fechaCreacion);
        this.estudiante = estudiante;
    }

    public int getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(int estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return super.toString() + "BecaMunicipal{" + "estudiante=" + estudiante + '}';
    }
}
