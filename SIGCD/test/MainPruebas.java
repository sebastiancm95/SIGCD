
import SIGCD.Data.DataAccessObject.Model;
import SIGCD.Logic.Formulario.AyudaTemporal;
import java.sql.Timestamp;
import java.util.ArrayList;

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
        Long datetime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(datetime);
        AyudaTemporal ayudaTemporal = new AyudaTemporal();
        ayudaTemporal = Model.instance().getAyudaTemporal(1);
        System.out.println(ayudaTemporal.toString());
        AyudaTemporal ayudaTemporal2 = new AyudaTemporal(1, timestamp, 1, "Emergencia");
        Model.instance().createAyudaTemporal(ayudaTemporal2);
        ArrayList<AyudaTemporal> lista = Model.instance().getAllAyudaTemporal();
        System.out.println(lista.size());
    }
}
