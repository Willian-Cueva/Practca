/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Willian
 */
public class NodoDE {
    private NodoDE ant;
    private Object dato;
    private NodoDE sig;

    public NodoDE() {
    }

    public NodoDE(NodoDE ant, Object dato, NodoDE sig) {
        this.ant = ant;
        this.dato = dato;
        this.sig = sig;
    }

    public NodoDE getAnt() {
        return ant;
    }

    public void setAnt(NodoDE ant) {
        this.ant = ant;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoDE getSig() {
        return sig;
    }

    public void setSig(NodoDE sig) {
        this.sig = sig;
    }
    
}
