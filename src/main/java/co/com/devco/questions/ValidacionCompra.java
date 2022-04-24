package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterfaces.DemoblazeCarritoPage.TITULO_PRODUCTO_CARRITO;

public class ValidacionCompra implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return TITULO_PRODUCTO_CARRITO.resolveFor(actor).getText();
    }
    public static ValidacionCompra tituloProducto(){
        return new ValidacionCompra();
    }
}
