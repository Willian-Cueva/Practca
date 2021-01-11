/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.InvertirLista;

import Controlador.ListaSimpleAvanzada;

/**
 *
 * @author Willian
 */
public class InvertirListaControlador {
    private ListaSimpleAvanzada ls = new ListaSimpleAvanzada();

    public ListaSimpleAvanzada getLs() {
        return ls;
    }

    public void setLs(ListaSimpleAvanzada ls) {
        this.ls = ls;
    }
    
    public void invertirLista(){
        ListaSimpleAvanzada tmp = new ListaSimpleAvanzada();
        for (int i = 0; i < ls.tamano(); i++) {
            tmp.insertarPila(this.ls.obtenerObjetopp(i));
        }
        ls = new ListaSimpleAvanzada();
        ls = tmp;
    }
    
    public String cadenaLista(){
        String cadena ="";
        for (int i = 0; i < ls.tamano(); i++) {
            cadena+=ls.obtenerObjetopp(i);
        }
        return cadena;
    }
    
}
