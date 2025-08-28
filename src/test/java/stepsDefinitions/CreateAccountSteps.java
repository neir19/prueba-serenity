package stepsDefinitions;

import com.prueba.Questions.ElementVisible;
import com.prueba.tasks.CreateAccountTask;
import com.prueba.tasks.LoadPageTask;
import com.prueba.tasks.RegisterTask;
import com.prueba.userInterfaces.HomePage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateAccountSteps {
    @Dado("el usuario ingresa a pagina")
    public void elUsuarioIngresaAPagina() {
        theActorInTheSpotlight().attemptsTo(LoadPageTask.loadingPage());
    }

    @Cuando("ingrese un (.+) presione registrarse")
    public void ingreseUnCorreoPresioneRegistrarse(String correo) {
        BrowseTheWeb.as(theActorInTheSpotlight()).waitFor(2).seconds();
        theActorInTheSpotlight().attemptsTo(RegisterTask.register(correo));
    }

    @Y("Se registre correctamente la  persona (.+)  (.+)  (.+), con nacida el (.+) de (.+) del (.+), con una contrasena (.+)$")
    public void seRegistreCorrectamenteLaPersonaGeneroNombreApellidoConNacidaElDiaDeMesDelAnoConUnaContrasenaContrasena(String genero,String nombre, String apellido, String dia, String mes, String ano, String contrasena) {
        theActorInTheSpotlight().attemptsTo(CreateAccountTask.create(genero,nombre,apellido,dia,mes,ano,contrasena));
    }
    @Entonces("el sistema muestra mensaje del home")
    public void elSistemaMuestraMensajeDelHome() {
       BrowseTheWeb.as(theActorInTheSpotlight()).waitFor(3).seconds();
        theActorInTheSpotlight().should(
                seeThat(ElementVisible.of(HomePage.LabelHomePage))
        );
    }
}
