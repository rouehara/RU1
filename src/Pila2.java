/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class Pila2 <t> {
    private  int max=10;
    private t[] elementos;//= new t[max]; //Object[] permite guardar cualquier tipo de variables
   

    public Pila2(int max) { // constructor
        this.max = max;
        elementos =(t[]) new Object[max];  //areglo genericos  elementos =(t[]) new Object[max;

    }
    private int tope = -1; 
    
    

    public boolean estavacia() {
        return (tope < 0);

    }

    public void empujar(t e) {
        //q no este llena
        if ((max - 1) == tope) {  // estavacia() se puede reemplazar
            System.out.println("error pila llena");
            return;
        } else {
            elementos[++tope] = e;
        }
    }

    public t sacar() {
        if ((tope < 0)) {
            System.out.println("error de pila vacia");
            return null;

        } else {
            t e = elementos[tope];
            elementos[tope--] = null;  // primeno le pongo null y luego decremento
            return e;
        }

    }
     public void listar(){
        System.out.println("listar");
        for(int i= tope; i>= 0;i--){ 
            System.out.println(elementos[i]);
        }
    }
}
