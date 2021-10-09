package SIGCD.Logic.Direccion;

public class Direccion {

    private String distrito;
    private String barrio;
    private String direccionExacta;

    public Direccion() {
    }

    public Direccion(String distrito, String barrio, String direccionExacta) {
        this.distrito = distrito;
        this.barrio = barrio;
        this.direccionExacta = direccionExacta;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccionExacta() {
        return direccionExacta;
    }

    public void setDireccionExacta(String direccionExacta) {
        this.direccionExacta = direccionExacta;
    }

    @Override
    public String toString() {
        return "Direccion{" + "distrito=" + distrito + ", barrio=" + barrio + ", direccionExacta=" + direccionExacta + '}';
    }
}
