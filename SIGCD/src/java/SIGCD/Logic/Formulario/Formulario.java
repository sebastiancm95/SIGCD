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

    public String getCedula() {
        return SCedula;
    }

    public void setCedula(String SCedula) {
        this.SCedula = SCedula;
    }

    public String getNombre_Completo() {
        return SNombre_Completo;
    }

    public void setNombre_Completo(String SNombre_Completo) {
        this.SNombre_Completo = SNombre_Completo;
    }

    public Direccion getDireccion() {
        return ODireccion;
    }

    public void setDireccion(Direccion ODireccion) {
        this.ODireccion = ODireccion;
    }

    public String getTelefono_Habitacion() {
        return STelefono_Habitacion;
    }

    public void setTelefono_Habitacion(String STelefono_Habitacion) {
        this.STelefono_Habitacion = STelefono_Habitacion;
    }

    public String getTelefono_Celular() {
        return STelefono_Celular;
    }

    public void setTelefono_Celular(String STelefono_Celular) {
        this.STelefono_Celular = STelefono_Celular;
    }

    @Override
    public String toString() {
        return "Formulario{" + "SCedula=" + SCedula + ", SNombre_Completo=" + SNombre_Completo + ", ODireccion=" + ODireccion + ", STelefono_Habitacion=" + STelefono_Habitacion + ", STelefono_Celular=" + STelefono_Celular + '}';
    }
}
