package com.proteccion.reto.task.accionescomunes;

import com.proteccion.reto.userinterface.accionescomunes.InicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class IniciarSesion implements Task {


    private String user;

    private String password;


    public IniciarSesion UsingUser (String user){
        this.user = user;
        return this;
    }


    public IniciarSesion UsingPassWord( String password){
        this.password = password;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Scroll.to(InicioSesion.User),
                Click.on(InicioSesion.User),
                Enter.theValue(user).into(InicioSesion.User),

                Scroll.to(InicioSesion.PassWord),
                Click.on(InicioSesion.PassWord),
                Enter.theValue(password).into(InicioSesion.PassWord),

                Scroll.to(InicioSesion.btnLogIn),
                Click.on(InicioSesion.btnLogIn)



        );

    }

    public static IniciarSesion iniciarSesion (){
        return new IniciarSesion();
    }
}
