package SIGCD.Logic.Formulario;

import SIGCD.Logic.Direccion.Direccion;

public class Ayuda_Temporal extends Formulario {

    private String STipo_Ayuda;
    private String SMotivo_Ayuda;

    public Ayuda_Temporal() {
    }

    public Ayuda_Temporal(int Id, String SCedula, String SNombre, String SPrimer_Nombre, String SSegundo_Apellido, Direccion ODireccion, String STelefono_Habitacion, String STelefono_Celular, String STipo_Ayuda, String SMotivo_Ayuda) {
        super(Id, SCedula, SNombre, SPrimer_Nombre, SSegundo_Apellido, ODireccion, STelefono_Habitacion, STelefono_Celular);
        this.STipo_Ayuda = STipo_Ayuda;
        this.SMotivo_Ayuda = SMotivo_Ayuda;
    }

    public String getTipo_Ayuda() {
        return STipo_Ayuda;
    }

    public void setTipo_Ayuda(String STipo_Ayuda) {
        this.STipo_Ayuda = STipo_Ayuda;
    }

    public String getMotivo_Ayuda() {
        return SMotivo_Ayuda;
    }

    public void setMotivo_Ayuda(String SMotivo_Ayuda) {
        this.SMotivo_Ayuda = SMotivo_Ayuda;
    }
}
