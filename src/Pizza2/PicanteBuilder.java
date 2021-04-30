/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza2;

/**
 *
 * @author jvelez
 */
public class PicanteBuilder extends PizzaBuilder{

    public PicanteBuilder() {
        pizza = new Pizza("Picante");
    }
    
    @Override
    public void construirMasa() {
        pizza.setParte("Masa", "Masa dura");
    }

    @Override
    public void construirIngredientes() {
        pizza.setParte("Ingredientes", "Salsa Picante y pimienta");
    }

    @Override
    public void construirQueso() {
        pizza.setParte("Queso", "Relleno");
    }

    @Override
    public void construirCompuesta() {
        pizza.setParte("Componente", "Salami");
    }
}
