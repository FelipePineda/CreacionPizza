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
public class HawaianaBuilder extends PizzaBuilder{

    public HawaianaBuilder() {
        pizza = new Pizza("Hawaiana");
    }

    
    @Override
    public void construirMasa() {
        pizza.setParte("Masa", "Masa Suave");
    }

    @Override
    public void construirIngredientes() {
        pizza.setParte("Ingredientes", "Salsa Dulce");
    }

    @Override
    public void construirQueso() {
        pizza.setParte("Queso", "Relleno");
    }

    @Override
    public void construirCompuesta() {
        pizza.setParte("Componente", "Piña y Jamón");
    }
    
}
