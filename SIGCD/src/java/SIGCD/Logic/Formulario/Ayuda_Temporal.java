package SIGCD.Logic.Formulario;

import java.time.LocalDateTime;

public class Ayuda_Temporal extends Formulario {

    private String SMotivo_Ayuda;

    public Ayuda_Temporal() {
    }

    public Ayuda_Temporal(int Id, String SCedula, String SNombre, String SPrimer_Nombre, String SPrimer_Apellido, String SSegundo_Apellido, String SDistrito, String SBarrio, String SSenas, String STelefono_Habitacion, String STelefono_Celular, LocalDateTime DFecha, String SMotivo_Ayuda) {
        super(Id, SCedula, SNombre, SPrimer_Apellido, SSegundo_Apellido, SDistrito, SBarrio, SSenas, STelefono_Habitacion, STelefono_Celular, DFecha);
        this.SMotivo_Ayuda = SMotivo_Ayuda;
    }

    public String getMotivo_Ayuda() {
        return SMotivo_Ayuda;
    }

    public void setMotivo_Ayuda(String SMotivo_Ayuda) {
        this.SMotivo_Ayuda = SMotivo_Ayuda;
    }
}
