package SIGCD.Logic.Formulario;

import SIGCD.Logic.Direccion.Direccion;

public class Beca_Municipal extends Formulario {

    private String SFecha_Nacimiento;
    private String SGrado_Cursando;
    private int IEdad;
    private String SNombre_Madre;
    private String SCedula_Madre;
    private String SNombre_Padre;
    private String SCedula_Padre;

    public Beca_Municipal() {
    }

    public Beca_Municipal(int Id, String SCedula, String SNombre, String SPrimer_Nombre, String SSegundo_Apellido, Direccion ODireccion, String STelefono_Habitacion, String STelefono_Celular, String SFecha_Nacimiento, String SGrado_Cursando, int IEdad, String SNombre_Madre, String SCedula_Madre, String SNombre_Padre, String SCedula_Padre) {
        super(Id, SCedula, SNombre, SPrimer_Nombre, SSegundo_Apellido, ODireccion, STelefono_Habitacion, STelefono_Celular);
        this.SFecha_Nacimiento = SFecha_Nacimiento;
        this.SGrado_Cursando = SGrado_Cursando;
        this.IEdad = IEdad;
        this.SNombre_Madre = SNombre_Madre;
        this.SCedula_Madre = SCedula_Madre;
        this.SNombre_Padre = SNombre_Padre;
        this.SCedula_Padre = SCedula_Padre;
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
}
