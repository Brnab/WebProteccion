package com.proteccion.reto.stepdefinition;

import com.github.javafaker.Faker;
import com.proteccion.reto.dashboard.ProcesoComprar;
import com.proteccion.reto.setup.setUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static com.proteccion.reto.task.accionescomunes.IniciarSesion.iniciarSesion;
import static com.proteccion.reto.task.landingpage.AbrirPaginaInicio.abrirPaginaInicio;
import static com.proteccion.reto.task.procesocomprar.ProcesoComprar.procesoComprar;
import static com.proteccion.reto.util.diccionario.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class procesoCompraStepDefinition extends setUp {




    Actor Bernabe = Actor.named("Bernabe");
    Faker faker = new Faker();

    @Given("Dado que inicio sesion en la pagina web")
    public void dado_que_inicio_sesion_en_la_pagina_web() {
        actorSetUpBrowser("Bernabe");
        theActorInTheSpotlight().wasAbleTo(abrirPaginaInicio());
        theActorInTheSpotlight().wasAbleTo(iniciarSesion()
                .UsingUser(USUARIO)
                .UsingPassWord(CONTRASENA));

    }

    @When("Selecciono los dos articulos y complete el proceso de comprar")
    public void selecciono_los_dos_articulos_y_complete_el_proceso_de_comprar() {

        theActorInTheSpotlight().attemptsTo(
                procesoComprar()
                        .usingFirstName(faker.name().firstName())
                        .usingLastName(faker.name().lastName())
                        .usingZipCode(faker.address().zipCode())

        );

    }

    @Then("Entonces me debe aparecer un mensaje exitoso confirmando la compra")
    public void entonces_me_debe_aparecer_un_mensaje_exitoso_confirmando_la_compra() {

        theActorInTheSpotlight().should(
                seeThat(" El mensaje de confirmación es ", ProcesoComprar.resultadoCompra(), equalTo (MENSAJE_CONFIRMACION))
        );

    }


}
