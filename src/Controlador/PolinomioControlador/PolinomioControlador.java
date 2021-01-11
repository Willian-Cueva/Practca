/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.PolinomioControlador;

import Controlador.ListaSimpleAvanzada;
import Modelo.Termino;

/**
 *
 * @author Willian
 */
public class PolinomioControlador {
    public static final int POLINOMIO1=0;
    public static final int POLINOMIO2=1;
    private ListaSimpleAvanzada polinomio1 = new ListaSimpleAvanzada();
    private ListaSimpleAvanzada polinomio2 = new ListaSimpleAvanzada();
    private Termino termino;
    
    public Boolean addTermino(int s){
        try {
            Termino x = new Termino(termino.getCoeficiente(), termino.getVariable(), termino.getGrado());
            if (s==0) {
                polinomio1.insertar(x);
            } else {
                polinomio2.insertar(x);
            }
            setTermino(null);
            return true;
        } catch (Exception e) {
            System.err.println("Error al insertar termino a la lista de polinomio - addTermino\n"+e);
            return false;
        }
    }

    public ListaSimpleAvanzada getPolinomio1() {
        return polinomio1;
    }

    public void setPolinomio1(ListaSimpleAvanzada polinomio1) {
        this.polinomio1 = polinomio1;
    }

    public ListaSimpleAvanzada getPolinomio2() {
        return polinomio2;
    }

    public void setPolinomio2(ListaSimpleAvanzada polinomio2) {
        this.polinomio2 = polinomio2;
    }

    public Termino getTermino() {
        if (this.termino==null) {
            this.termino=new Termino();
        }
        return termino;
    }

    public void setTermino(Termino termino) {
        this.termino = termino;
    }
    
}
