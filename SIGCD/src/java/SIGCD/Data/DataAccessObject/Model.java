package SIGCD.Data.DataAccessObject;

import SIGCD.Logic.Formulario.AyudaTemporal;
import SIGCD.Logic.Formulario.BecaMunicipal;
import java.util.ArrayList;

public class Model {

    private static Model uniqueInstance;
    private AyudaTemporalDA ayudaTemporalDao;
    private BecaMunicipalDAO becaMunicipalDao;

    public Model() {
        this.ayudaTemporalDao = new AyudaTemporalDA();
        this.becaMunicipalDao = new BecaMunicipalDAO();
    }

    public static Model instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Model();
        }
        return uniqueInstance;
    }

    //Metodos Ayuda temporal
    public AyudaTemporal getAyudaTemporal(int IdAyudaTemporal) throws Exception {
        return ayudaTemporalDao.read(IdAyudaTemporal);
    }

    public void createAyudaTemporal(AyudaTemporal ayudaTemporal) throws Exception {
        ayudaTemporalDao.create(ayudaTemporal);
    }

    public ArrayList<AyudaTemporal> getAllAyudaTemporal() throws Exception {
        return ayudaTemporalDao.readAll();
    }
    
    //Metodos Beca municipal
        public BecaMunicipal getBecaMunicipal(int Id) throws Exception {
        return becaMunicipalDao.read(Id);
    }
        
//    public void becaMunicipalCreate(BecaMunicipal result) throws Exception {
//        becaMunicipalDao.create(result);
//    }
//
//    public ArrayList< BecaMunicipal> getAllBecaMunicipal() throws Exception {
//        return becaMunicipalDao.readAll();
//    }
//
}
