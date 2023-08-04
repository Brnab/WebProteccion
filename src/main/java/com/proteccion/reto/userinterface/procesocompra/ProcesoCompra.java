package com.proteccion.reto.userinterface.procesocompra;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProcesoCompra extends PageObject {

    public static final Target addBackPack = Target
            .the("backPack").
            located(By.id("add-to-cart-sauce-labs-backpack"));


    public static final Target addBikeLight = Target
            .the("BikeLight").
            located(By.id("add-to-cart-sauce-labs-bike-light"));


    public static final Target btnShoppingCar = Target
            .the("Boton Shopping Car").
            located(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));

    public static final Target btnCheckOut = Target
            .the("Boton Checkout").
            located(By.id("checkout"));

    public static final Target firstName = Target
            .the("Primer Nombre").
            located(By.id("first-name"));

    public static final Target lastName = Target
            .the("Apellido").
            located(By.id("last-name"));

    public static final Target zipCode = Target
            .the("Apellido").
            located(By.id("last-name"));


    public static final Target btnContinue = Target
            .the("Boton Continuar").
            located(By.id("continue"));


    public static final Target btnFinish = Target
            .the("Boton Finalizar").
            located(By.id("finish"));


    public static final Target confirmationMessage  = Target
            .the("Mensaje confirmacion").
            located(By.xpath("//h2[contains(text(),'Thank you for your order!')]"));
}
