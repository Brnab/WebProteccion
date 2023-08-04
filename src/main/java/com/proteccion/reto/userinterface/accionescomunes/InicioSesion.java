package com.proteccion.reto.userinterface.accionescomunes;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesion extends PageObject {

    public static final Target User = Target
            .the("Usuario")
            .located(By.id("//input[@id='user-name']"));


    public static final Target PassWord = Target
            .the("Password")
            .located(By.id("//input[@id='password']"));

    public static final Target btnLogIn = Target
            .the("Log In Button")
            .located(By.id("login-button"));

}
