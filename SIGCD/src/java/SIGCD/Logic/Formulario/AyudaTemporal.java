package SIGCD.Logic.Formulario;

import SIGCD.Logic.Direccion.Direccion;

public class AyudaTemporal extends Formulario {
    private String tipoAyuda;
    private String motivoAyuda;
    
    public AyudaTemporal() {
    }
    
    public AyudaTemporal(String cedula, String nombreCompleto, Direccion direccion, String telefonoHabitacion, String telefonoCelular, String tipoAyuda, String motivoAyuda) {
        super(cedula,nombreCompleto,direccion,telefonoHabitacion,telefonoCelular);
        this.tipoAyuda = tipoAyuda;
        this.motivoAyuda = motivoAyuda;
    }

    public String getTipoAyuda() {
        return tipoAyuda;
    }

    public void setTipoAyuda(String tipoAyuda) {
        this.tipoAyuda = tipoAyuda;
    }

    public String getMotivoAyuda() {
        return motivoAyuda;
    }

    public void setMotivoAyuda(String motivoAyuda) {
        this.motivoAyuda = motivoAyuda;
    }

    @Override
    public String toString() {
        return "AyudaTemporal{" + "tipoAyuda=" + tipoAyuda + ", motivoAyuda=" + motivoAyuda + '}';
    }
}
