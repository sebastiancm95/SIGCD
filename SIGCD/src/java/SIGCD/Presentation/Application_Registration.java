package SIGCD.Presentation;

import SIGCD.Logic.Formulario.Ayuda_Temporal;
import SIGCD.Logic.Formulario.Beca_Municipal;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

@ApplicationPath("api")
public class Application_Registration extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        HashSet<Class<?>> classes = new HashSet<>();
        classes.add(MultiPartFeature.class);
        classes.add(Ayuda_Temporal.class);
        classes.add(Beca_Municipal.class);
        return classes;
    }
}
