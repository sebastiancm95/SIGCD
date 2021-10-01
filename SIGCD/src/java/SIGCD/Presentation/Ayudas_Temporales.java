package SIGCD.Presentation;

import SIGCD.Data.DataAccessObject.Model;
import SIGCD.Logic.Formulario.Ayuda_Temporal;
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

@Path("/ayuda_Temporal")

public class Ayudas_Temporales {

    @Context
    HttpServletRequest request;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void add(Ayuda_Temporal OAyuda_Temporal) {
        try {
            Model.instance().ayuda_Temporal_Create(OAyuda_Temporal);
        } catch (Exception ex) {
            throw new NotAcceptableException();
        }
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<Ayuda_Temporal> search() throws Exception {
        return Model.instance().getAll_Ayuda_Temporal();
    }
}
