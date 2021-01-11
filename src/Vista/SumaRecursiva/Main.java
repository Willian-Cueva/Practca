/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.SumaRecursiva;

import Controlador.SumaRecursiva.SumaControlador;

/**
 *
 * @author Willian
 */
public class Main {

    public static void main(String[] args) {
        SumaControlador sc = new SumaControlador();
        for (int i = 1; i < 5; i++) {
            sc.getLs().insertar(i);
        }
        System.out.println(sc.suma());
        sc.getLs().present();
//        sc.presentar();
    }
}
