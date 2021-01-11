/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Imprimir;

import Controlador.Imprimir.ImprimirControlador;

/**
 *
 * @author Willian
 */
public class MainImprimir {
    public static void main(String[] args) {
        ImprimirControlador ic = new ImprimirControlador();
        ic.imprimir();
    }
}
