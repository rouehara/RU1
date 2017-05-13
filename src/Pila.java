
public class Pila {

    // private final int max; //= 1000; lo asigno por constriçuctor
    private int max;
    private Object[] elementos = new Object[max]; //Object[] permite guardar cualquier tipo de variables
    private int tope = -1;

    public Pila(int max) { // constructor
        this.max = max;
        elementos = new Object[max];

    }

    public boolean estavacia() {
        return (tope < 0);

    }

    public void empujar(Object e) {
        //q no este llena
        if ((max - 1) == tope) {  // estavacia() se puede reemplazar
            System.out.println("error pila llena");
            return;
        } else {
            elementos[++tope] = e;
        }
    }

    public Object sacar() {
        if ((tope < 0)) {
            System.out.println("error de pila vacia");
            return null;

        } else {
            Object e = elementos[tope];
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
    
     public void listar1(){
         System.out.println("listar");
        for(int i= 0 ; i<=tope ;i++){ 
            System.out.println(elementos[i]);
        }
    }
}
