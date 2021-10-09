package SIGCD.Data.DataAccessObject;

import SIGCD.Logic.Formulario.AyudaTemporal;
import SIGCD.Logic.Formulario.BecaMunicipal;
import SIGCD.Logic.Persona.Solicitante;
import java.util.ArrayList;

public class Model {

    private static Model uniqueInstance;
    private AyudaTemporalDao ayudaTemporalDao;
    private BecaMunicipalDao becaMunicipalDao;
    
    
    public Model() {
        this.ayudaTemporalDao = new AyudaTemporalDao();
        this.becaMunicipalDao = new BecaMunicipalDao();
    }

    public static Model instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Model();
        }
        return uniqueInstance;
    }

    //Metodos Ayuda temporal
    public void createAyudaTemporal(AyudaTemporal ayudaTemporal) throws Exception {
        ayudaTemporalDao.create(ayudaTemporal);
    }

    public ArrayList<AyudaTemporal> getAllAyudaTemporal() throws Exception {
        return ayudaTemporalDao.readAll();
    }

    public AyudaTemporal getAyudaTemporal(int IdAyudaTemporal) throws Exception {
        return ayudaTemporalDao.read(IdAyudaTemporal);
    }
//
//    //Metodos Beca municipal
//    public void becaMunicipalCreate(BecaMunicipal result) throws Exception {
//        becaMunicipalDao.create(result);
//    }
//
//    public ArrayList< BecaMunicipal> getAllBecaMunicipal() throws Exception {
//        return becaMunicipalDao.readAll();
//    }
//
//    public BecaMunicipal getBecaMunicipal(int Id) throws Exception {
//        return becaMunicipalDao.read(Id);
//    }
}
