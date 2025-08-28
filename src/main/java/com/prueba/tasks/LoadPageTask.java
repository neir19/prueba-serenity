package com.prueba.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.environment.SystemEnvironmentVariables;



public class LoadPageTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(SystemEnvironmentVariables.createEnvironmentVariables().getProperty("url_home_page")));

    }
    public static LoadPageTask  loadingPage(){
        return Tasks.instrumented(LoadPageTask.class);
    }
}
