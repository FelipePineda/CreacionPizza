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
public abstract class PizzaBuilder {
    protected Pizza pizza;
    
    public Pizza getPizza(){
        return pizza;
    }
    
    public abstract void construirMasa();
    public abstract void construirIngredientes();
    public abstract void construirQueso();
    public abstract void construirCompuesta();
   
}
