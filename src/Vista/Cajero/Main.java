/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Cajero;

import Controlador.Cajero.CajeroControlador;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class Main {
    public static void main(String[] args) {
        CajeroControlador cc = new CajeroControlador();
//        cc.getCajeros().present();
        int numero = Integer.valueOf(JOptionPane.showInputDialog(null, "Cuantos clientes desea generar aleatoriamente?"));
        cc.generarClientes(numero);
        cc.atender();
        cc.informe();
    }
}
