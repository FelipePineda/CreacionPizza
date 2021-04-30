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
public class Tienda {
    public void construir(PizzaBuilder pizzaBuilder){
        pizzaBuilder.construirMasa();
        pizzaBuilder.construirIngredientes();
        pizzaBuilder.construirQueso();
        pizzaBuilder.construirCompuesta();
    }
}
