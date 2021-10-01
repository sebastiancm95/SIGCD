package SIGCD.Logic.Formulario;

import SIGCD.Logic.Direccion.Direccion;

public class Formulario {

    private String SCedula;
    private String SNombre_Completo;
    private Direccion ODireccion;
    private String STelefono_Habitacion;
    private String STelefono_Celular;

    public Formulario() {
    }

    public Formulario(String SCedula, String SNombre_Completo, Direccion ODireccion, String STelefono_Habitacion, String STelefono_Celular) {
        this.SCedula = SCedula;
        this.SNombre_Completo = SNombre_Completo;
        this.ODireccion = ODireccion;
        this.STelefono_Habitacion = STelefono_Habitacion;
        this.STelefono_Celular = STelefono_Celular;
    }

    public String getSCedula() {
        return SCedula;
    }

    public void setSCedula(String SCedula) {
        this.SCedula = SCedula;
    }

    public String getSNombre_Completo() {
        return SNombre_Completo;
    }

    public void setSNombre_Completo(String SNombre_Completo) {
        this.SNombre_Completo = SNombre_Completo;
    }

    public Direccion getODireccion() {
        return ODireccion;
    }

    public void setODireccion(Direccion ODireccion) {
        this.ODireccion = ODireccion;
    }

    public String getSTelefono_Habitacion() {
        return STelefono_Habitacion;
    }

    public void setSTelefono_Habitacion(String STelefono_Habitacion) {
        this.STelefono_Habitacion = STelefono_Habitacion;
    }

    public String getSTelefono_Celular() {
        return STelefono_Celular;
    }

    public void setSTelefono_Celular(String STelefono_Celular) {
        this.STelefono_Celular = STelefono_Celular;
    }

    @Override
    public String toString() {
        return "Formulario{" + "SCedula=" + SCedula + ", SNombre_Completo=" + SNombre_Completo + ", ODireccion=" + ODireccion + ", STelefono_Habitacion=" + STelefono_Habitacion + ", STelefono_Celular=" + STelefono_Celular + '}';
    }
}
