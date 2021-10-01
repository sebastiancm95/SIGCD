package SIGCD.Data.DataAccessObject;

import SIGCD.Logic.Formulario.Ayuda_Temporal;
import SIGCD.Logic.Formulario.Beca_Municipal;
import java.util.ArrayList;

public class Model {

    private static Model uniqueInstance;
    private Ayuda_Temporal_Dao OAyuda_Temporal_Dao;
    private Beca_Municipal_Dao OBeca_Municipal_Dao;

    public static Model instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Model();
        }
        return uniqueInstance;
    }

    public Model() {
        this.OAyuda_Temporal_Dao = new Ayuda_Temporal_Dao();
        this.OBeca_Municipal_Dao = new Beca_Municipal_Dao();
    }

    //Metodos Ayuda temporal
    public void ayuda_Temporal_Create(Ayuda_Temporal result) throws Exception {
        OAyuda_Temporal_Dao.create(result);
    }

    public ArrayList<Ayuda_Temporal> getAll_Ayuda_Temporal() throws Exception {
        return OAyuda_Temporal_Dao.readAll();
    }

    public Ayuda_Temporal get_Ayuda_Temporal(int Id) throws Exception {
        return OAyuda_Temporal_Dao.read(Id);
    }

    //Metodos Beca municipal
    public void beca_Municipal_Create(Beca_Municipal result) throws Exception {
        OBeca_Municipal_Dao.create(result);
    }

    public ArrayList< Beca_Municipal> getAll_Beca_Municipal() throws Exception {
        return OBeca_Municipal_Dao.readAll();
    }

    public Beca_Municipal get_Beca_Municipal(int Id) throws Exception {
        return OBeca_Municipal_Dao.read(Id);
    }
}
