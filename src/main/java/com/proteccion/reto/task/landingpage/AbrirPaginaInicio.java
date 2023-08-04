package com.proteccion.reto.task.landingpage;

import com.proteccion.reto.userinterface.landingpage.PaginaInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaInicio implements Task {


    private PaginaInicio paginaInicio;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(paginaInicio));

    }

    public static AbrirPaginaInicio abrirPaginaInicio () {
        return new AbrirPaginaInicio();
    }
}
