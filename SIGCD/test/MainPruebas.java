
import SIGCD.Data.DataAccessObject.Model;
import SIGCD.Logic.Direccion.Direccion;
import SIGCD.Logic.Formulario.AyudaTemporal;
import SIGCD.Logic.Persona.Solicitante;
import java.sql.Timestamp;
import java.time.Instant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sebas
 */
public class MainPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        Model model = Model.instance();
        Timestamp fechaCreacion = Timestamp.from(Instant.now());
        Direccion direccion = new Direccion("San Pablo", "San Pablo", "150 metros norte de la iglesia");
        Solicitante solicitante = new Solicitante(1, "402260762", "Sebastian", "Cabezas", "Madrigal", "40802923", "84051285", direccion);
        AyudaTemporal ayudaTemporal = new AyudaTemporal(1, 1, fechaCreacion, solicitante, "Emergencia");
        System.out.println(ayudaTemporal.toString());
        model.getAyudaTemporal(1);
    }
}
