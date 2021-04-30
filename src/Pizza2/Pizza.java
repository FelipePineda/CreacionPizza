/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jvelez
 */
public class Pizza {
    private String tipoPizza;
    private Map<String,String> partes = new HashMap<String, String>();

    public Pizza(String tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public String getParte(String clave){
        return partes.get(clave);
    }
    
    public void setParte(String clave, String valor){
        partes.put(clave, valor);
    }
    
    public void mostrar(){
        System.out.println("\n--------------------");
        System.out.println("Tipo de Pizza "+tipoPizza);
        System.out.println("Masa : "+partes.get("Masa"));
        System.out.println("Ingredientes  : "+partes.get("Ingredientes"));
        System.out.println("Componente : "+partes.get("Componente"));
        System.out.println("Queso: "+partes.get("Queso"));
    }
}
