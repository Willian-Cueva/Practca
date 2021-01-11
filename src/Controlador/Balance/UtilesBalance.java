/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Balance;

import Controlador.ListaSimpleAvanzada;

/**
 *
 * @author Willian
 */
public class UtilesBalance {
    public static ListaSimpleAvanzada convExpre(String expresion){
        ListaSimpleAvanzada lsa = new ListaSimpleAvanzada();
        for (int i = 0; i < expresion.length(); i++) {
            lsa.insertar(expresion.charAt(i));
        }
        return lsa;
    }
}
