package SIGCD.Data.DataAccessObject;

import SIGCD.Logic.Formulario.AyudaTemporal;
import SIGCD.Logic.Formulario.BecaMunicipal;
import java.util.ArrayList;

public class Model {

    private static Model uniqueInstance;
    private AyudaTemporalDao ayudaTemporalDao;
    private BecaMunicipalDao becaMunicipalDao;

    public static Model instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Model();
        }
        return uniqueInstance;
    }

    public Model() {
        this.ayudaTemporalDao = new AyudaTemporalDao();
        this.becaMunicipalDao = new BecaMunicipalDao();
    }

    //Metodos Ayuda temporal
//    public void ayudaTemporalCreate(AyudaTemporal result) throws Exception {
//        ayudaTemporalDao.create(result);
//    }
//
//    public ArrayList<AyudaTemporal> getAllAyudaTemporal() throws Exception {
//        return ayudaTemporalDao.readAll();
//    }
//
//    public AyudaTemporal getAyudaTemporal(int Id) throws Exception {
//        return ayudaTemporalDao.read(Id);
//    }
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
