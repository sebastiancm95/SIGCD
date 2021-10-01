package SIGCD.Logic.Formulario;

import SIGCD.Logic.Direccion.Direccion;

public class Beca_Municipal extends Formulario {

    private String SFecha_Nacimiento;
    private String SGrado_Cursando;
    private int Iedad;
    private String SNombre_Madre;
    private String SCedula_Madre;
    private String SNombre_Padre;
    private String SCedula_Padre;

    public Beca_Municipal() {
    }

    public Beca_Municipal(String SCedula, String SNombre_Completo, Direccion ODireccion, String STelefono_Habitacion, String STelefono_Celular, String SFecha_Nacimiento, String SGrado_Cursando, int Iedad, String SNombre_Madre, String SCedula_Madre, String SNombre_Padre, String SCedula_Padre) {
        super(SCedula, SNombre_Completo, ODireccion, STelefono_Habitacion, STelefono_Celular);
        this.SFecha_Nacimiento = SFecha_Nacimiento;
        this.SGrado_Cursando = SGrado_Cursando;
        this.Iedad = Iedad;
        this.SNombre_Madre = SNombre_Madre;
        this.SCedula_Madre = SCedula_Madre;
        this.SNombre_Padre = SNombre_Padre;
        this.SCedula_Padre = SCedula_Padre;
    }

    public String getSFecha_Nacimiento() {
        return SFecha_Nacimiento;
    }

    public void setSFecha_Nacimiento(String SFecha_Nacimiento) {
        this.SFecha_Nacimiento = SFecha_Nacimiento;
    }

    public String getSGrado_Cursando() {
        return SGrado_Cursando;
    }

    public void setSGrado_Cursando(String SGrado_Cursando) {
        this.SGrado_Cursando = SGrado_Cursando;
    }

    public int getIedad() {
        return Iedad;
    }

    public void setIedad(int Iedad) {
        this.Iedad = Iedad;
    }

    public String getSNombre_Madre() {
        return SNombre_Madre;
    }

    public void setSNombre_Madre(String SNombre_Madre) {
        this.SNombre_Madre = SNombre_Madre;
    }

    public String getSCedula_Madre() {
        return SCedula_Madre;
    }

    public void setSCedula_Madre(String SCedula_Madre) {
        this.SCedula_Madre = SCedula_Madre;
    }

    public String getSNombre_Padre() {
        return SNombre_Padre;
    }

    public void setSNombre_Padre(String SNombre_Padre) {
        this.SNombre_Padre = SNombre_Padre;
    }

    public String getSCedula_Padre() {
        return SCedula_Padre;
    }

    public void setSCedula_Padre(String SCedula_Padre) {
        this.SCedula_Padre = SCedula_Padre;
    }

    @Override
    public String toString() {
        return "Beca_Municipal{" + "SFecha_Nacimiento=" + SFecha_Nacimiento + ", SGrado_Cursando=" + SGrado_Cursando + ", Iedad=" + Iedad + ", SNombre_Madre=" + SNombre_Madre + ", SCedula_Madre=" + SCedula_Madre + ", SNombre_Padre=" + SNombre_Padre + ", SCedula_Padre=" + SCedula_Padre + '}';
    }
}
