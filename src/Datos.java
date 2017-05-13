/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila p = new Pila(5);
        
        p.empujar("A");
        p.empujar("C");
        p.empujar("D");
        p.empujar("E");
        //System.out.println(p.sacar());
       
        p.listar();
        p.listar1();
    }
    
}
