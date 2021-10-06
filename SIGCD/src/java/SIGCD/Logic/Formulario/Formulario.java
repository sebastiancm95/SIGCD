package SIGCD.Logic.Formulario;

import SIGCD.Logic.Direccion.Direccion;

public class Formulario {

    private int Id;
    private String SCedula;
    private String SNombre;
    private String SPrimer_Apellido;
    private String SSegundo_Apellido;
    private Direccion ODireccion;
    private String STelefono_Habitacion;
    private String STelefono_Celular;
    private String SEstado;

    public Formulario() {
    }

    public Formulario(int Id, String SCedula, String SNombre, String SPrimer_Apellido, String SSegundo_Apellido, Direccion ODireccion, String STelefono_Habitacion, String STelefono_Celular) {
        this.Id = Id;
        this.SCedula = SCedula;
        this.SNombre = SNombre;
        this.SPrimer_Apellido = SPrimer_Apellido;
        this.SSegundo_Apellido = SSegundo_Apellido;
        this.ODireccion = ODireccion;
        this.STelefono_Habitacion = STelefono_Habitacion;
        this.STelefono_Celular = STelefono_Celular;
        this.SEstado = "En proceso de revisión";
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCedula() {
        return SCedula;
    }

    public void setCedula(String SCedula) {
        this.SCedula = SCedula;
    }
    
     public String getNombre() {
        return SNombre;
    }

    public void setNombre(String SNombre) {
        this.SNombre = SNombre;
    }
    
    public String getPrimer_Apellido() {
        return SPrimer_Apellido;
    }

    public void setPrimer_Apellido(String SPrimer_Apellido) {
        this.SPrimer_Apellido = SPrimer_Apellido;
    }

    public String getSegundo_Apellido() {
        return SSegundo_Apellido;
    }

    public void setSegundo_Apellido(String SSegundo_Apellido) {
        this.SSegundo_Apellido = SSegundo_Apellido;
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

    public String getEstado() {
        return SEstado;
    }

    public void setEstado(String SEstado) {
        this.SEstado = SEstado;
    }
}
