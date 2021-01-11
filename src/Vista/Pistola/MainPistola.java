/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Pistola;

import Controlador.Pistola.PistolaControlador;
import Controlador.Pistola.UtilesPistola;

/**
 *
 * @author Willian
 */
public class MainPistola {
    public static void main(String[] args) {
        PistolaControlador pc = new PistolaControlador();
        for (int i = 0; i < 4; i++) {
            pc.getPersona().setNombre(UtilesPistola.nombreAleatorio());
            pc.getPersona().setPistola(false);
            if (pc.addPersona()) {
                System.out.println("Se inserto la persona correctamente");
            } else {
                System.err.println("No se inserto la lista");
            }
        }
//        UtilesPistola.tienePistola(pc.getLc());
        pc.getLc().present();
//        System.out.println("La posicion de salvcion es: "+UtilesPistola.posicionDeSalvacion(pc.getLc()));
        
        pc.jugar();
        System.out.print("Sobrevivio -> ");
        pc.getLc().present();
    }
}
