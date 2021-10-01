package SIGCD.Logic.Direccion;

public class Direccion {

    private String Sdistrito;
    private String Sbarrio;
    private String Sdireccion_Exacta;

    public Direccion() {
    }

    public Direccion(String Sdistrito, String Sbarrio, String Sdireccion_Exacta) {
        this.Sdistrito = Sdistrito;
        this.Sbarrio = Sbarrio;
        this.Sdireccion_Exacta = Sdireccion_Exacta;
    }

    public String getDistrito() {
        return Sdistrito;
    }

    public void setDistrito(String Sdistrito) {
        this.Sdistrito = Sdistrito;
    }

    public String getBarrio() {
        return Sbarrio;
    }

    public void setBarrio(String Sbarrio) {
        this.Sbarrio = Sbarrio;
    }

    public String getDireccion_Exacta() {
        return Sdireccion_Exacta;
    }

    public void setDireccion_Exacta(String Sdireccion_Exacta) {
        this.Sdireccion_Exacta = Sdireccion_Exacta;
    }

    @Override
    public String toString() {
        return "Direccion{" + "distrito=" + Sdistrito + ", barrio=" + Sbarrio + ", direccionExacta=" + Sdireccion_Exacta + '}';
    }
}
