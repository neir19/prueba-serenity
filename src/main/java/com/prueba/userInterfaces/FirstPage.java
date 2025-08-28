package com.prueba.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FirstPage {
    public static Target LabelAuthentication= Target.the("Campo de validacion de pantalla autenticacion").located(By.xpath("//h1[text()='Authentication']"));
    public static final Target BotonCrearUnaCuenta= Target.the("Botón para crear cuenta").located(By.xpath("//*[contains(text(),'Sign in')]"));
    public static final Target CampoEmail= Target.the("campo de email para creacion de cuenta").located(By.id("email_create"));
    public static final Target BotonCrear= Target.the("boton crear un registro ").located(By.xpath("//*[contains(text(),'CREATE AN ACCOUNT')]"));

    public static Target LabelCreate= Target.the("Campo de validacion de pantalla registrar").located(By.xpath("//h1[text()='Authentication']"));
    public static final Target CheckGenerMr= Target.the("check para genero masculino").located(By.id("uniform-id_gender1"));
    public static final Target CheckGenerMrs= Target.the("check para genero femeino").located(By.id("uniform-id_gender2"));
    public static final Target CampoNombre= Target.the("campo nombre de la creacion").located(By.id("customer_firstname"));
    public static final Target CampoApellido= Target.the("campo Apellido de la creacion").located(By.id("customer_lastname"));
    public static final Target CampoContraseña= Target.the("campo contraseña de la creacion").located(By.id("passwd"));
    public static final Target SelectorDia= Target.the("campo día de nacimiento").located(By.id("days"));
    public static final Target Item= Target.the("selector del día").locatedBy("//*[contains(text(),'{0}')]");
    public static  final Target SelectMes= Target.the("Selector del mes").located(By.id("months"));
    public static  final Target CampoAno= Target.the("Selector del Año").located(By.id("years"));
    public static final Target Checksuscribirse= Target.the("check de suscribcion  al boletin").located(By.id("newsletter"));
    public static final Target BotonRegistrar= Target.the("botón de registro").located(By.id("submitAccount"));








}
