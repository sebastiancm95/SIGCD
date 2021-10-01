package SIGCD.Presentation;

import SIGCD.Data.DataAccessObject.Model;
import SIGCD.Logic.Formulario.Beca_Municipal;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotAcceptableException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/beca_Municipal")

public class Becas_Municipales {

    @Context
    HttpServletRequest request;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void add(Beca_Municipal OBeca_Municipal) {
        try {
            Model.instance().beca_Municipal_Create(OBeca_Municipal);
        } catch (Exception ex) {
            throw new NotAcceptableException();
        }
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<Beca_Municipal> search() throws Exception {
        return Model.instance().getAll_Beca_Municipal();
    }
}
