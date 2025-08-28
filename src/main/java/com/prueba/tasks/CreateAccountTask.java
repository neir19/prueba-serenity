package com.prueba.tasks;

import com.prueba.userInterfaces.FirstPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateAccountTask  implements Task {
    private String genero, nombre, apellido, dia,mes, ano, contrasena;

    public CreateAccountTask(String genero,String nombre, String apellido, String dia, String mes, String ano, String contrasena) {
       this.genero= genero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(FirstPage.LabelCreate, isVisible()).forNoMoreThan(10).seconds());
        if(genero.equalsIgnoreCase("hombre")){
            actor.attemptsTo(Click.on(FirstPage.CheckGenerMr));
        }else if (genero.equalsIgnoreCase("mujer")){
            actor.attemptsTo(Click.on(FirstPage.CheckGenerMrs));


        }
        actor.attemptsTo(Enter.theValue(nombre).into(FirstPage.CampoNombre));
        actor.attemptsTo(Enter.theValue(apellido).into(FirstPage.CampoApellido));
        actor.attemptsTo(Enter.theValue(contrasena).into(FirstPage.CampoContraseña));
        actor.attemptsTo(Click.on(FirstPage.SelectorDia));
        actor.attemptsTo(Click.on(FirstPage.Item.of(dia)));
        actor.attemptsTo(Click.on(FirstPage.SelectMes.of(mes)));
        actor.attemptsTo(Enter.keyValues(ano).into(FirstPage.CampoAno));
        actor.attemptsTo(Click.on(FirstPage.Checksuscribirse));
        actor.attemptsTo(Click.on(FirstPage.BotonRegistrar));

    }
    public static final  CreateAccountTask create(String genero,String nombre, String apellido, String dia, String mes, String ano, String contrasena){
        return Tasks.instrumented(CreateAccountTask.class,genero,nombre,apellido,dia,mes,ano,contrasena);
    }
}
