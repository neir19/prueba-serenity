package com.prueba.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target LabelHomePage= Target.the("Letrero de logueo exitoso").located(By.xpath("//*[contains(text(),'My account')]"));
}
