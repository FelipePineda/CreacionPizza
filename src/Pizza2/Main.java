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
public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        PizzaBuilder builder;
        
        builder = new HawaianaBuilder();
        tienda.construir(builder);
        builder.pizza.mostrar();
        
        builder = new PicanteBuilder();
        tienda.construir(builder);
        builder.pizza.mostrar();
    }
}
