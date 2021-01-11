/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interprete;

import Controlador.ListaSimpleAvanzada;

/**
 *
 * @author Willian
 */
public class InterpreteControlador {
    private ListaSimpleAvanzada expresion = new ListaSimpleAvanzada();
    private ListaSimpleAvanzada posfija = new ListaSimpleAvanzada();
    private ListaSimpleAvanzada polaca = new ListaSimpleAvanzada();

    public void generarExpPosfija(){
        posfija.cabecera=null;
//        if (posfija.vaciar()) {
//            System.out.println("Se elimino la lista");
//        } else {
//            System.err.println("No se pudo eliminar la lista");
//        }
        ListaSimpleAvanzada pila = new ListaSimpleAvanzada();
        for (int i = 0; i < expresion.tamano(); i++) {
            String cad = String.valueOf(expresion.obtenerObjetopp(i));
            char c = cad.charAt(0);
            if (UtilesInterprete.esNumero(c)) {
                posfija.insertar(expresion.obtenerObjetopp(i));
            } else if(UtilesInterprete.esOperador(c)){
                pila.insertarPila(c);
                accion(c,pila,posfija);               
            }else if (UtilesInterprete.abierto(c)) {
                pila.insertarPila(c);
            }else{
                pila.insertarPila(c);
                while (!UtilesInterprete.abierto(String.valueOf(pila.obtenerObjetopp(1)).charAt(0))) {                    
                    posfija.insertar(pila.obtenerObjetopp(1));
                    pila.emilinarDpp(1);
                }
                 pila.emilinarDpp(0);
                 pila.emilinarDpp(0);
//                 pila.emilinarDpp(0);
            }
//            System.out.println(">====== Pila ========<");
//            pila.present();
//            System.out.println(">==== fin Pila =====<");
        }
        while (!pila.estaVacia()) { 
//            System.out.println(">====== Pila ======== while<");
//            pila.present();
//            System.out.println(">==== fin Pila =====<");
            posfija.insertar(pila.obtenerObjetopp(0));
            pila.emilinarDpp(0);
        }
    }
    
    public ListaSimpleAvanzada getExpresion() {
//        this.expresion= new ListaSimpleAvanzada();
//        expresion.cabecera=null;
        return expresion;
    }

    public void setExpresion(ListaSimpleAvanzada expresion) {
        this.expresion = expresion;
    }

    public ListaSimpleAvanzada getPosfija() {
        return posfija;
    }

    public void setPosfija(ListaSimpleAvanzada posfija) {
        this.posfija = posfija;
    }

    public ListaSimpleAvanzada getPolaca() {
        return polaca;
    }

    public void setPolaca(ListaSimpleAvanzada polaca) {
        this.polaca = polaca;
    }

    private void accion(char c, ListaSimpleAvanzada pila, ListaSimpleAvanzada exp) {
        if (pila.tamano()>1) {
             switch(UtilesInterprete.idCaso(c,pila)){
                    case 0 -> {
                        exp.insertar(pila.obtenerObjetopp(1));
                        pila.emilinarDpp(1);
                }
//                    case 1 -> {
//                }
                    case 2 -> {
                        
                        while (!UtilesInterprete.abierto(String.valueOf(pila.obtenerObjetopp(1)).charAt(0)) && pila.tamano()!=0) {                            
                            exp.insertar(pila.obtenerObjetopp(1));
                            pila.emilinarDpp(1);
                        }
//                        pila.insertarPila(c);
                }
                        default -> {
                }
                }
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
