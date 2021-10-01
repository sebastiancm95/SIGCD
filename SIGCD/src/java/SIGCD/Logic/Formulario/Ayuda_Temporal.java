package SIGCD.Logic.Formulario;

import SIGCD.Logic.Direccion.Direccion;

public class Ayuda_Temporal extends Formulario {

    private String STipo_Ayuda;
    private String STotivo_Ayuda;

    public Ayuda_Temporal() {
    }

    public Ayuda_Temporal(String STipo_Ayuda, String STotivo_Ayuda) {
        this.STipo_Ayuda = STipo_Ayuda;
        this.STotivo_Ayuda = STotivo_Ayuda;
    }

    public Ayuda_Temporal(String SCedula, String SNombre_Completo, Direccion ODireccion, String STelefono_Habitacion, String STelefono_Celular, String STipo_Ayuda, String STotivo_Ayuda) {
        super(SCedula, SNombre_Completo, ODireccion, STelefono_Habitacion, STelefono_Celular);
        this.STipo_Ayuda = STipo_Ayuda;
        this.STotivo_Ayuda = STotivo_Ayuda;
    }

    public String getSTipo_Ayuda() {
        return STipo_Ayuda;
    }

    public void setSTipo_Ayuda(String STipo_Ayuda) {
        this.STipo_Ayuda = STipo_Ayuda;
    }

    public String getSTotivo_Ayuda() {
        return STotivo_Ayuda;
    }

    public void setSTotivo_Ayuda(String STotivo_Ayuda) {
        this.STotivo_Ayuda = STotivo_Ayuda;
    }
}
