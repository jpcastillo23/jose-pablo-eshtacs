/*
 * @author Jose Pablo Castillo
 * Carne 10007
 * Universidad del Valle de Guatemala
 * Programacion Orientada a objetos
 *
 *
 * Clase interfaz encargada de ser la pila
 * Esta ligeramente modificada para un lenguaje mas comodo
 * de entender
 */


package eshtacs;

/**
 *
 * @param <T>
 * @author jaypicastillo
 */
public interface NewInterface<T> {
 /*
 * Funcion encargada de introduir un objeto tipo <T>
 * a la pila.
 */
    /**
     *
     * @param item
     */
    public void push(T item);
 /*
     * Funcion encargada de devolver el objeto que
     * estaba asta el tope (ultimo ingresado) de la pila
     */

    /**
     *
     * @return
     */
    public T pop();

    /*
     * Encargado de Devolver el Valor de componentes
     * en la pila
     */

    /**
     *
     * @return
     */
    public int size();

    /*
     * Funcion designada para devolver un boolean indicanco
     * si la pila esta vacia o llena
     */

    /**
     *
     * @return
     */
    public boolean isEmpty();
    /*
     * Encargado de retornar un objeto (no alias) con las
     * mismas caracteristicas de quien está en el tope
     *
     */

    /**
     *
     * @return
     */
    public T peek();
    /*
     * retorna una descripcion de como esta pila se encuentra
     */

    /**
     *
     * @return
     */
    public String toString();
}
