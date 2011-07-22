/*
 * Jose Pablo Castillo
 * Carne 10007
 * Universidad del Valle de Guatemala
 * Programacion Orientada a objetos
 *
 */
package eshtacs;

import java.util.Vector;

/**
 *
 * @param <T>
 * @author jaypicastillo
 */
public class myEshtack<T> implements NewInterface<T> {


    private Vector<T> lista;
    private int index;
    /*
     * Metodo abstracto implementado para ingresar
     * un objeto a la pila
     */
    /**
     * 
     */
    public myEshtack(){
        lista = new Vector();
        index = 0;
    }


    /**
     *
     * @param item
     */
    @Override
    public void push(T item){
        lista.add(item);
        index += 1;
    }
 /*
     * Funcion encargada de devolver el objeto que
     * estaba asta el tope (ultimo ingresado) de la pila
     */

    /**
     *
     * @return
     */
    @Override
    public T pop(){
        if(this.isEmpty()||index==-1)
            return null;
        else{
            index -= 1;
            T temp = lista.get(index);
            lista.remove(index);
            return temp;
        }
    }

    /*
     * Encargado de Devolver el Valor de componentes
     * en la pila
     */

    /**
     *
     * @return
     */
    @Override
    public int size(){
        return lista.size();
    }
    /*
     * Funcion designada para devolver un boolean indicanco
     * si la pila esta vacia o llena
     */

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    /*
     * Encargado de retornar un objeto (no alias) con las
     * mismas caracteristicas de quien está en el tope
     *
     */

    /**
     *
     * @return
     */
    @Override
    public T peek(){
        if(this.isEmpty())
            return null;
        else{
            return lista.get(index-1);
        }
    }
    /*
     * retorna una descripcion de como esta pila se encuentra
     */

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        String temp= "Estado de pila:  "+ index+"\n";
        return temp;
        }
}
