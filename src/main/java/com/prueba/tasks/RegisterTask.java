package com.prueba.tasks;

import com.prueba.userInterfaces.FirstPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class RegisterTask implements Task {

    private String correo;

    public RegisterTask(String correo) {
        this.correo = correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FirstPage.BotonCrear));
        actor.attemptsTo(WaitUntil.the(FirstPage.LabelAuthentication, isVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Enter.theValue(correo).into(FirstPage.CampoEmail));
        actor.attemptsTo(Click.on(FirstPage.BotonCrear));

    }
    public static final RegisterTask register(String correo){
        return Tasks.instrumented(RegisterTask.class,correo);
    }
}
