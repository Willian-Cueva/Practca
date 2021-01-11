/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Pistola;

import Modelo.NodoDE;

/**
 *
 * @author Willian
 */
public class ListaCircular {

    public NodoDE cabecera;

    public Boolean estaVacia() {
        return cabecera == null;
    }

    public int tamano() {
        int cont = 0;
        if (!estaVacia()) {
            NodoDE it = cabecera;
            cont++;
            while (it.getSig() != cabecera) {
                it = it.getSig();
                cont++;
            }
        }
        return cont;
    }

    public void insertar(Object objeto) {
        if (estaVacia()) {
            NodoDE x = new NodoDE();
            x.setAnt(x);
            x.setDato(objeto);
            x.setSig(x);
            cabecera = x;
//            cabecera = new NodoDE(cabecera, objeto, cabecera);
        } else {
            NodoDE it = cabecera;
            for (int i = 1; i < tamano(); i++) {
                it = it.getSig();
            }
            NodoDE aux = new NodoDE(it, objeto, cabecera);
            it.setSig(aux);
            cabecera.setAnt(aux);
        }
    }

    public void present() {
        if (estaVacia()) {
            System.out.println("la lista circular esta vacia");
        } else {
            NodoDE it = cabecera;
            for (int i = 0; i < tamano(); i++) {
                System.out.println((i+1)+": "+it.getDato());
//                System.out.println(it.getAnt().getDato() + "<-" + it.getDato() + "->" + it.getSig().getDato());
                it = it.getSig();
            }
        }
    }

    public Object obtenerDpp(int posicion) {
        if (estaVacia()) {
            return "La lista esta vacia";
        } else {
            NodoDE it = cabecera;
            for (int i = 0; i < posicion; i++) {
                it = it.getSig();
            }
            return it.getDato();
        }
    }

    public Boolean eliminarDpp(int posicion) {
        try {
            if (estaVacia()) {
                System.out.println("La lista esta vacia - eliminarDpp()");
                return false;
//            


            } else {
                NodoDE it = cabecera;
                for (int i = 1; i < posicion; i++) {
                    it = it.getSig();
                }
                NodoDE aux = it.getSig().getSig();
                aux.setAnt(it);
                it.setSig(aux);
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error al eliminiar una persona - eliminarDpp()");
            return false;
        }
    }
}
