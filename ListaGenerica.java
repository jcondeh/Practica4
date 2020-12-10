package practica2TPA;

import java.util.Arrays;
 
class Lista<E> {
    private Object[] lista;   //object array
    public int length;

    public Lista(int length)    {
    	lista = new Object [length];
        this.length = length;
    }
    

    E get(int i) {
        final E e = (E)lista[i];
        return e;
    }

    void set(int i, E e) {
    	lista[i] = e;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(lista); //override es el polimorfismo dinamico de toString
    }
}


