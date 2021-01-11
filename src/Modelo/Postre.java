/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ListaSimpleAvanzada;

/**
 *
 * @author Willian
 */
public class Postre {
    private String nombre;
    private ListaSimpleAvanzada listaIngredientes = new ListaSimpleAvanzada();

    public Postre() {
    }   
    
    public Postre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaSimpleAvanzada getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ListaSimpleAvanzada listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    @Override
    public String toString() {
        return "Postre: "+nombre;  
    }    
    
}
