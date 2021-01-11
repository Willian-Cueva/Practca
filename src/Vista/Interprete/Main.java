/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Interprete;

import Controlador.Interprete.InterpreteControlador;
import Controlador.Interprete.UtilesInterprete;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class Main {

    public static void main(String[] args) {
        InterpreteControlador ic = new InterpreteControlador();
        String expresion = "1+5+3+[7-(7+4*5)*5+2]";
//        String expresion = "1+5";
        UtilesInterprete.descomponerExpresion(expresion, ic.getExpresion());
        ic.getExpresion().present();
//        ic.setPosfija(UtilesInterprete.obtenerListaCaracteres(ic.getExpresion()));
//        ic.getPosfija().present();
//        if (UtilesInterprete.estaBalenceada(ic.getExpresion())) {
//            JOptionPane.showMessageDialog(null, "La expresion esta balanceada");
//        }
        ic.generarExpPosfija();
        ic.getPosfija().present();
        double d = UtilesInterprete.resolver(ic.getPosfija());
        System.out.println(""+d);

//        int a=5,b=4;
//        double d = a+b;
//        System.out.println(""+d);
    }
}
