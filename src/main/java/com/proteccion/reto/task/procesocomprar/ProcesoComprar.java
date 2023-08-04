package com.proteccion.reto.task.procesocomprar;

import com.proteccion.reto.userinterface.procesocompra.ProcesoCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class ProcesoComprar implements Task {


    private String primerNom;

    private String apellido;

    private String zip;

    public String MensajeConfirmacion;

    public void  setMensajeConfirmacion( String Texto){
        this.MensajeConfirmacion = Texto;

    }

    public ProcesoComprar usingFirstName (String nombre){
        this.primerNom = nombre;
        return this;

    }

    public ProcesoComprar usingLastName ( String apellido){
        this.apellido = apellido;
        return this;
    }

    public ProcesoComprar usingZipCode ( String zipcode){

        this.zip = zipcode;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(ProcesoCompra.addBackPack),
                Click.on(ProcesoCompra.addBackPack),

                Scroll.to(ProcesoCompra.addBikeLight),
                Click.on(ProcesoCompra.addBikeLight),

                Scroll.to(ProcesoCompra.btnShoppingCar),
                Click.on(ProcesoCompra.btnShoppingCar),


                Scroll.to(ProcesoCompra.btnCheckOut),
                Click.on(ProcesoCompra.btnCheckOut),

                Scroll.to(ProcesoCompra.firstName),
                Click.on(ProcesoCompra.firstName),
                Enter.theValue(primerNom).into(ProcesoCompra.firstName),

                Scroll.to(ProcesoCompra.lastName),
                Click.on(ProcesoCompra.lastName),
                Enter.theValue(apellido).into(ProcesoCompra.lastName),


                Scroll.to(ProcesoCompra.zipCode),
                Click.on(ProcesoCompra.zipCode),
                Enter.theValue(zip).into(ProcesoCompra.zipCode),

                Scroll.to(ProcesoCompra.btnContinue),
                Click.on(ProcesoCompra.btnContinue),

                Scroll.to(ProcesoCompra.btnFinish),
                Click.on(ProcesoCompra.btnFinish),

                Scroll.to(ProcesoCompra.btnContinue),
                Click.on(ProcesoCompra.btnContinue),

                Scroll.to(ProcesoCompra.confirmationMessage)




        );

    }
}
