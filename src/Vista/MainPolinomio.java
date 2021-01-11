/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.PolinomioControlador.PolinomioControlador;
import Controlador.PolinomioControlador.UtilesPolinomio;

/**
 *
 * @author Willian
 */
public class MainPolinomio {
    public static void main(String[] args) {
        PolinomioControlador pc = new PolinomioControlador();
        
        for (int i = 1; i <= 3; i++) {
            pc.getTermino().setCoeficiente(i);
            pc.getTermino().setGrado(i);
            pc.getTermino().setVariable("x");
            pc.addTermino(PolinomioControlador.POLINOMIO1);
        }
        for (int i = 1; i <= 3; i++) {
            pc.getTermino().setCoeficiente(i);
            pc.getTermino().setGrado(i);
            pc.getTermino().setVariable("x");
            pc.addTermino(PolinomioControlador.POLINOMIO2);
        }
        
        System.out.println("++++++++*******--------++++++++/////////");
        pc.getPolinomio1().present();
        System.out.println("++++++++*******--------++++++++/////////");
        pc.getPolinomio2().present();
        System.out.println("++++++++*******--------++++++++/////////");
        System.out.println(UtilesPolinomio.expresion(pc.getPolinomio1()));
        System.out.println("++++++++*******--------++++++++/////////");
        System.out.println(UtilesPolinomio.expresion(pc.getPolinomio2()));
        System.out.println("++++++++*******--------++++++++/////////");
        System.out.println(UtilesPolinomio.expresion(UtilesPolinomio.sumarPolinomios(pc.getPolinomio1(), pc.getPolinomio2())));

    }
}
