/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.InvertirLista;

import Controlador.InvertirLista.InvertirListaControlador;
import Controlador.InvertirLista.UtilesInvertir;

/**
 *
 * @author Willian
 */
public class Main {

    public static void main(String[] args) {
        InvertirListaControlador ilc = new InvertirListaControlador();
        String cadena = "Anitalavalatina";
        UtilesInvertir.descomponerExp(cadena, ilc.getLs());
        ilc.getLs().present();
        ilc.invertirLista();
        ilc.getLs().present();
        System.out.println(ilc.cadenaLista());
    }
}
