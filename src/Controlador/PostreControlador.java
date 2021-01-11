/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Ingrediente;
import Modelo.Postre;

/**
 *
 * @author Willian
 */
public class PostreControlador {
    private ListaSimpleAvanzada lsa = new ListaSimpleAvanzada();
    private Postre postre;
    private Ingrediente ingrediente;
    public Boolean addPostre(){
        try {
            Postre aux = postre;
            aux.setNombre(postre.getNombre());
            lsa.insertar(aux);
            return true;
        } catch (Exception e) {
            System.err.println("No se pudo agragar postre a la lista\n"+e);
            return false;
        }
    }
    
    public Boolean addIngrediente(int posicion){
        try {
            Postre x = (Postre) lsa.obtenerObjetopp(posicion);
            Ingrediente aux = this.ingrediente;
            aux.setNombre(ingrediente.getNombre());
            aux.setCantidad(ingrediente.getCantidad());
            x.getListaIngredientes().insertar(aux);
            return true;
        } catch (Exception e) {
            System.err.println("No se pudo agregar el ingrediente al postre\n"+e);
            return false;
        }
    }
    
    public void mostrarIngredientes(int posicion){
        try {
            Postre x = (Postre) lsa.obtenerObjetopp(posicion);
            x.getListaIngredientes().present();
        } catch (Exception e) {
            System.err.println("Error al presentar los ingredientes del postre");
        }
    }
    
    public ListaSimpleAvanzada listaIngredientes(int posicion){
        try {
            Postre x = (Postre) lsa.obtenerObjetopp(posicion);
            return x.getListaIngredientes();
        } catch (Exception e) {
            System.err.println("Error al presentar los ingredientes del postre");
            return null;
        }
    }
    
    public ListaSimpleAvanzada getLsa() {
        return lsa;
    }

    public void setLsa(ListaSimpleAvanzada lsa) {
        this.lsa = lsa;
    }

    public Postre getPostre() {
        if(this.postre==null)
            this.postre=new Postre();
        return postre;
    }

    public void setPostre(Postre postre) {
        this.postre = postre;
    }

    public Ingrediente getIngrediente() {
        if (this.ingrediente==null) {
            this.ingrediente=new Ingrediente();
        }
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    
}
