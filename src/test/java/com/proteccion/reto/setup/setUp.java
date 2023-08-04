package com.proteccion.reto.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class setUp {

    @Managed()
    protected WebDriver browser;

    private void setupBrowser(WebDriver browser){
        WebDriverManager.chromedriver().setup();
        browser.manage().deleteAllCookies();
        browser.manage().window().maximize();
    }


    private void setupUsuario(String name, WebDriver browser){
        OnStage.setTheStage( new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(browser));
    }

    protected void actorSetUpBrowser(String actorName){
        setupBrowser(browser);
        setupUsuario(actorName, browser);


    }
}
