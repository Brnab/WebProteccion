package com.proteccion.reto.dashboard;

import com.proteccion.reto.userinterface.procesocompra.ProcesoCompra;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ProcesoComprar {


    public static Question<String> resultadoCompra(){
        return actor -> TextContent.of(ProcesoCompra.confirmationMessage).viewedBy(actor).asString().trim();
    }
}
