/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Pistola;

import Modelo.Pistola.PersonaP;

/**
 *
 * @author Willian
 */
public class UtilesPistola {
    public static double posicionDeSalvacion(ListaCircular lc){
        double num= 0;
        if (!lc.estaVacia()) {
            int grupo = lc.tamano();
            num=1+(grupo-exp(grupo)*2);
        }
        return num;
    }
    
    public static double exp(int numero){
        int i=1;
        Boolean b = true;
        while(b){
            int inf = (int) Math.pow(2, i);
            int max = (int) Math.pow(2, (i+1));
            if (inf<numero && numero<max) {
                break;
            }
            i++;
        }
        return Math.pow(2, i);
    }
    
    public static String nombreAleatorio(){
        String [] nombres={"Juan","Patricio","Maria","Jostin","Issac","Emely","Boster","Cristopher",
        "Manuel","Ruth","Diego","Sebastian","Willian","Katty","EmilyR","Alex","Luis","Nahomi","Michelle",
        "Maria Jose","Sarahi","Rebeca","Graciela"};
        int limite = nombres.length-1;
        int aleatorio = (int) Math.floor(Math.random()*limite);
        return nombres[aleatorio];
    }
     public static int tienePistola(ListaCircular lc){
        int cont=0;
        for (int i = 0; i < lc.tamano(); i++) {
            PersonaP p = (PersonaP) lc.obtenerDpp(i);
            if (p.getPistola()) {
                cont=i;
                break;
            }
        }
        if (cont==0) {
            PersonaP x=(PersonaP) lc.obtenerDpp(0);
            x.setPistola(true);
        }
        return cont;
    }
}
