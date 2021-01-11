/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.SumaRecursiva;

import Controlador.ListaSimple;
import Controlador.ListaSimpleAvanzada;
import Modelo.Nodo;

/**
 *
 * @author Willian
 */
public class SumaControlador {

    private ListaSimpleAvanzada ls = new ListaSimpleAvanzada();

    public int suma() {
        int r = 0;
        if (ls.tamano() > 1) {
            r=sumaRecursiva(ls.obtenerNodopp(0));                
        } else {
            r=(int) ls.obtenerObjetopp(0);
        }
            return r;
    }

    public int sumaRecursiva(Nodo numero) {
        int sum=0;
        if (numero.getSig() != null) {
            sum=(int) numero.getDato()+sumaRecursiva(numero.getSig());
        } else {
            sum =(int) numero.getDato();
        }
        return sum;
    }

    public ListaSimpleAvanzada getLs() {
        return ls;
    }

    public void setLs(ListaSimpleAvanzada ls) {
        this.ls = ls;
    }

    public void presentar() {
        for (int i = 0; i < ls.tamano(); i++) {
            System.out.println(ls.obtenerNodopp(i).getDato());
        }
    }
    

}
