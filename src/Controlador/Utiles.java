/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Postre;

/**
 *
 * @author Willian
 */
public class Utiles {
    public static String obtenerNombre(Object obj){
        Postre x = (Postre) obj;
        return x.getNombre();
    }
}
