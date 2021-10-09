package SIGCD.Presentation;

import SIGCD.Logic.Formulario.AyudaTemporal;
import SIGCD.Logic.Formulario.BecaMunicipal;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

@ApplicationPath("api")
public class ApplicationRegistration extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        HashSet<Class<?>> classes = new HashSet<>();
        classes.add(MultiPartFeature.class);
        classes.add(AyudaTemporal.class);
        classes.add(BecaMunicipal.class);
        return classes;
    }
}
