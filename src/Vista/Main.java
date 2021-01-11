/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.PostreControlador;

/**
 *
 * @author Willian
 */
public class Main {
    public static void main(String[] args) {
        PostreControlador pc = new PostreControlador();
        pc.getPostre().setNombre("guatita");
        pc.addPostre();
        pc.setPostre(null);
        pc.getLsa().present();
        
        pc.getPostre().setNombre("camarones al ajillo");
        pc.addPostre();
        pc.setPostre(null);
        
        pc.getIngrediente().setNombre("Papa bolona");
        pc.getIngrediente().setCantidad("3 lib");
        pc.addIngrediente(0);
        pc.setIngrediente(null);
        
        pc.getIngrediente().setNombre("menudo");
        pc.getIngrediente().setCantidad("2.5 lib");
        pc.addIngrediente(0);
        pc.setIngrediente(null);
        
        pc.getLsa().present();
        
        pc.mostrarIngredientes(0);
        pc.listaIngredientes(0).present();
        
    }
}
