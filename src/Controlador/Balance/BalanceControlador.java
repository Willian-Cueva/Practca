/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Balance;

import Controlador.ListaSimpleAvanzada;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class BalanceControlador {
    private ListaSimpleAvanzada expresion = new ListaSimpleAvanzada();
    
    public void balance(){
        int parA=0,parC=0;
        int corA=0,corC=0;
        int llaA=0,llaC=0;
        for (int i = 0; i < expresion.tamano(); i++) {
            char c = (char) expresion.obtenerObjetopp(i);
            switch(c){
                case '(': parA++;
                break;
                case ')': parC++;
                break;
                case '[': corA++;
                break;
                case ']': corC++;
                break;
                case '{': llaA++;
                break;
                case '}': llaC++;
                break;
                default: break;                
            }
        }
        Boolean b1=comp(parA, parC, 0),
                b2=comp(corA, corC, 1),
                b3=comp(llaA, llaC, 2);
        
         if (b1 && b2 && b3) {
            JOptionPane.showMessageDialog(null, "La exprecion esta correcta");
        }
    }
    private Boolean comp(int a, int b, int s){
        String [] nom = {"parentesis","corchetes","llaves"};
        Boolean chis = false;
        if (a==b) {
            System.out.println(nom[s]+" correctos");
            chis=true;
        } else if(a>b){
            JOptionPane.showMessageDialog(null, "Faltan "+(a-b)+" "+nom[s]+" de cierre ')'");
        }else{
            JOptionPane.showMessageDialog(null, "Faltan "+(b-a)+" "+nom[s]+" de apertura '('");
        }
        return chis;
    }

    public ListaSimpleAvanzada getExpresion() {
        return expresion;
    }

    public void setExpresion(ListaSimpleAvanzada expresion) {
        this.expresion = expresion;
    }
       
}
