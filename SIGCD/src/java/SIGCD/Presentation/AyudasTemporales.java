package SIGCD.Presentation;

import SIGCD.Data.DataAccessObject.Model;
import SIGCD.Logic.Formulario.AyudaTemporal;
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

@Path("/ayuda-temporal")

public class AyudasTemporales {

//    @Context
//    HttpServletRequest request;
//
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void add(AyudaTemporal ayudaTemporal) {
//        try {
//            Model.instance().createAyudaTemporal(ayudaTemporal);
//        } catch (Exception ex) {
//            throw new NotAcceptableException();
//        }
//    }
//
//    @GET
//    @Produces({MediaType.APPLICATION_JSON})
//    public ArrayList<AyudaTemporal> search() throws Exception {
//        return Model.instance().getAllAyudaTemporal();
//    }
}
