package SIGCD.Logic.Formulario;

import SIGCD.Logic.Persona.Persona;
import java.sql.Timestamp;

public class Formulario {

    private int IdFormulario;
    private int estado;
    private Persona persona;
    private Timestamp fechaCreacion;

    public Formulario() {
    }

    public Formulario(int IdFormulario, int estado, Persona persona, Timestamp fechaCreacionCreacion) {
        this.IdFormulario = IdFormulario;
        this.estado = estado;
        this.persona = persona;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdFormulario() {
        return IdFormulario;
    }

    public void setIdFormulario(int IdFormulario) {
        this.IdFormulario = IdFormulario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Formulario{" + "Id=" + IdFormulario + ", estado=" + estado + ", persona=" + persona + ", fechaCreacion=" + fechaCreacion + '}';
    }
}
