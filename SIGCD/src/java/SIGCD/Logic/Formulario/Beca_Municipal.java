package SIGCD.Logic.Formulario;

import java.time.LocalDateTime;

public class Beca_Municipal extends Formulario {

    private String SFecha_Nacimiento;
    private String SGrado_Cursando;
    private int IEdad;
    private String SNombre_Madre;
    private String SCedula_Madre;
    private String SPrimer_Apellido_Madre;
    private String SSegundo_Apellido_Madre;
    private String SNombre_Padre;
    private String SCedula_Padre;
    private String SPrimer_Apellido_Padre;
    private String SSegundo_Apellido_Padre;

    public Beca_Municipal() {
    }

    public Beca_Municipal(int Id, String SCedula, String SNombre, String SPrimer_Nombre, String SPrimer_Apellido, String SSegundo_Apellido, String SDistrito, String SBarrio, String SSenas, String STelefono_Habitacion, String STelefono_Celular, String SFecha_Nacimiento, String SGrado_Cursando, int IEdad, String SCedula_Madre, String SNombre_Madre, String SPrimer_Apellido_Madre, String SSegundo_Apellido_Madre, String SCedula_Padre, String SNombre_Padre, String SPrimer_Apellido_Padre, String SSegundo_Apellido_Padre, LocalDateTime DFecha) {
        super(Id, SCedula, SNombre, SPrimer_Apellido, SSegundo_Apellido, SDistrito, SBarrio, SSenas, STelefono_Habitacion, STelefono_Celular, DFecha);
        this.SFecha_Nacimiento = SFecha_Nacimiento;
        this.SGrado_Cursando = SGrado_Cursando;
        this.IEdad = IEdad;
        this.SNombre_Madre = SNombre_Madre;
        this.SCedula_Madre = SCedula_Madre;
        this.SPrimer_Apellido_Madre = SPrimer_Apellido_Madre;
        this.SSegundo_Apellido_Madre = SSegundo_Apellido_Madre;
        this.SNombre_Padre = SNombre_Padre;
        this.SCedula_Padre = SCedula_Padre;
        this.SPrimer_Apellido_Madre = SPrimer_Apellido_Padre;
        this.SSegundo_Apellido_Madre = SSegundo_Apellido_Padre;
    }

    public String getFecha_Nacimiento() {
        return SFecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String SFecha_Nacimiento) {
        this.SFecha_Nacimiento = SFecha_Nacimiento;
    }

    public String getGrado_Cursando() {
        return SGrado_Cursando;
    }

    public void setGrado_Cursando(String SGrado_Cursando) {
        this.SGrado_Cursando = SGrado_Cursando;
    }

    public int getEdad() {
        return IEdad;
    }

    public void setEdad(int IEdad) {
        this.IEdad = IEdad;
    }

    public String getNombre_Madre() {
        return SNombre_Madre;
    }

    public void setNombre_Madre(String SNombre_Madre) {
        this.SNombre_Madre = SNombre_Madre;
    }

    public String getCedula_Madre() {
        return SCedula_Madre;
    }

    public void setCedula_Madre(String SCedula_Madre) {
        this.SCedula_Madre = SCedula_Madre;
    }

    public String getNombre_Padre() {
        return SNombre_Padre;
    }

    public void setNombre_Padre(String SNombre_Padre) {
        this.SNombre_Padre = SNombre_Padre;
    }

    public String getCedula_Padre() {
        return SCedula_Padre;
    }

    public void setCedula_Padre(String SCedula_Padre) {
        this.SCedula_Padre = SCedula_Padre;
    }

    public String getPrimer_Apellido_Madre() {
        return SPrimer_Apellido_Madre;
    }

    public void setPrimer_Apellido_Madre(String SPrimer_Apellido_Madre) {
        this.SPrimer_Apellido_Madre = SPrimer_Apellido_Madre;
    }

    public String getSegundo_Apellido_Madre() {
        return SSegundo_Apellido_Madre;
    }

    public void setSegundo_Apellido_Madre(String SSegundo_Apellido_Madre) {
        this.SSegundo_Apellido_Madre = SSegundo_Apellido_Madre;
    }

    public String getPrimer_Apellido_Padre() {
        return SPrimer_Apellido_Padre;
    }

    public void setPrimer_Apellido_Padre(String SPrimer_Apellido_Padre) {
        this.SPrimer_Apellido_Padre = SPrimer_Apellido_Padre;
    }

    public String getSegundo_Apellido_Padre() {
        return SSegundo_Apellido_Padre;
    }

    public void setSegundo_Apellido_Padre(String SSegundo_Apellido_Padre) {
        this.SSegundo_Apellido_Padre = SSegundo_Apellido_Padre;
    }
}
