package SIGCD.Logic.Formulario;

import SIGCD.Logic.Persona.Persona;
import java.sql.Timestamp;

public class Formulario {

    private int Id;
    private int estado;
    private Persona persona;
    private Timestamp fecha;

    public Formulario() {
    }

    public Formulario(int Id, int estado, Persona persona, Timestamp fecha) {
        this.Id = Id;
        this.estado = estado;
        this.persona = persona;
        this.fecha = fecha;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Formulario{" + "Id=" + Id + ", estado=" + estado + ", persona=" + persona + ", fecha=" + fecha + '}';
    }
}
