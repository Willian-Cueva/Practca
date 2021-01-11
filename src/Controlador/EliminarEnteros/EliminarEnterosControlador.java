/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.EliminarEnteros;

import Controlador.ListaSimpleAvanzada;

/**
 *
 * @author Willian
 */
public class EliminarEnterosControlador {
    private ListaSimpleAvanzada enteros = new ListaSimpleAvanzada();
    private ListaSimpleAvanzada posiciones = new ListaSimpleAvanzada();

    public Boolean eliminarPosiciones(){
        try {
            for (int i = 0; i < posiciones.tamano(); i++) {
                int s = (int) posiciones.obtenerObjetopp(i);
                enteros.emilinarDpp(s-i);
            }
            return true;
        } catch (Exception e) {
            System.err.println("Error al eliminar por posiciones\n"+e);
            return false;
        }
    }
    
    public Boolean addPosicion(int poscicion){
        try {
            if (enteros.tamano()<poscicion) {
                return false;
            } else {
                posiciones.insertar(poscicion);
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error al insertar posicion\n"+e);
            return false;
        }
    }
    public ListaSimpleAvanzada getEnteros() {
        return enteros;
    }

    public void setEnteros(ListaSimpleAvanzada enteros) {
        this.enteros = enteros;
    }

    public ListaSimpleAvanzada getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(ListaSimpleAvanzada posiciones) {
        this.posiciones = posiciones;
    }
    
}
