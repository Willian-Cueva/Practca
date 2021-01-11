/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.EliminarEnteros;

import Controlador.EliminarEnteros.EliminarEnterosControlador;

/**
 *
 * @author Willian
 */
public class Main {

    public static void main(String[] args) {
        EliminarEnterosControlador cn = new EliminarEnterosControlador();

        for (int i = 0; i < 10; i++) {
            cn.getEnteros().insertar(i);
        }

        cn.getEnteros().present();
        System.out.println("---0-00-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-00-0-0-0");
        if (cn.addPosicion(2)) {
            System.out.println("se agrego a la lista con exito");
        } else {
            System.out.println("No se pudo agrgar a la lista");
        }
        if (cn.addPosicion(5)) {
            System.out.println("se agrego a la lista con exito");
        } else {
            System.out.println("No se pudo agrgar a la lista");
        }

        cn.getPosiciones().present();
        System.out.println("---0-00-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-00-0-0-0");

        cn.eliminarPosiciones();

        System.out.println("---0-00-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-00-0-0-0");
        cn.getEnteros().present();
    }
}
