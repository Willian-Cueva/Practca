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
public class UtilesPolinomio {
    public static ListaSimpleAvanzada sumarPolinomios(ListaSimpleAvanzada lsa1,ListaSimpleAvanzada lsa2){
        ListaSimpleAvanzada sum = new ListaSimpleAvanzada();
        for (int i = 0; i < lsa1.tamano(); i++) {
            Termino aux1 = (Termino) lsa1.obtenerObjetopp(i);
            Boolean existe=false;
            for (int j = 0; j < lsa2.tamano(); j++) {
                Termino aux2 = (Termino) lsa2.obtenerObjetopp(j);
                if (coeEqual(aux1, aux2)) {
                    int suma=aux1.getCoeficiente()+aux2.getCoeficiente();
                    Termino x = new Termino(suma, aux2.getVariable(), aux2.getGrado());
                    sum.insertar(x);
                    existe=true;
                    break;
                }
            }
            if (!existe) {
                sum.insertar(aux1);
            }
        }
        for (int i = 0; i < lsa2.tamano(); i++) {
            Termino aux1= (Termino) lsa2.obtenerObjetopp(i);
            Boolean existe=false;
            for (int j = 0; j < sum.tamano(); j++) {
                Termino aux2 = (Termino) sum.obtenerObjetopp(j);
                if (aux1.getGrado()==aux2.getGrado()) {
                    existe=true;
                    break;
                }
            }
            if (!existe) {
                sum.insertar(aux1);
            }
        }
        return sum;
    }
    
    public static Boolean coeEqual(Termino t,Termino t2){
        Boolean chis=false;
        if (t.getVariable().equals(t2.getVariable()) && t.getGrado()==t2.getGrado()) {
            chis=true;
        }
        return chis;
    }
    
    public static String expresion(ListaSimpleAvanzada lsa){
        if(lsa.estaVacia())return "";
        String exp = "";
        for (int i = 0; i < lsa.tamano(); i++) {
            Termino x = (Termino) lsa.obtenerObjetopp(i);
            if (x.getCoeficiente()>0) {
                exp+=("+"+x.getCoeficiente());
            }else{
                exp+=("+"+x.getCoeficiente());              
            }
            if (x.getVariable()!=null) {
                exp+=(x.getVariable());
                if (x.getGrado()>=1) {
                    exp+=("^"+x.getGrado());
                }
            }
        }
        return exp;
    }
}
