/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interprete;

import Controlador.ListaSimpleAvanzada;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class UtilesInterprete {

    public static Double resolver(ListaSimpleAvanzada posfija) {
        ListaSimpleAvanzada pila = new ListaSimpleAvanzada();
        for (int i = 0; i < posfija.tamano(); i++) {
            String el = String.valueOf(posfija.obtenerObjetopp(i));
            char c = el.charAt(0);
            if (esNumero(c)) {
                pila.insertarPila(el);
            } else {
                if (pila.estaVacia()) {
                    break;
                }
                try {
                    double res = operacion(c, pila.obtenerObjetopp(1), pila.obtenerObjetopp(0));
                    pila.emilinarDpp(0);
                    pila.emilinarDpp(0);
                    pila.insertarPila(res);
                } catch (Exception e) {
                    System.err.println("No se pudo resolver error - resolver()");
                }
            }
        }
        return (Double) pila.obtenerObjetopp(0);
    }

    public static Boolean esOperador(char c) {
        Boolean ban = false;
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            ban = true;
        }
        return ban;
    }

    public static void descomponerExpresion(String cadena, ListaSimpleAvanzada lsa) {
        int i = 0;
        while (i < cadena.length()) {
            String s = "";
            int j = i;
            do {
                s = s + cadena.charAt(j);
                j++;
                if (j == cadena.length()) {
                    break;
                }
            } while (esNumero(cadena.charAt(i)) && esNumero(cadena.charAt(j)));
            if (i + 1 == j) {
                i++;
            } else {
                i = j;
            }
            if (esNumero(s.charAt(0))) {
                int n = Integer.parseInt(s);
                lsa.insertar(n);
            } else {
                lsa.insertar(s);
            }
//            lsa.insertar(s);
        }
    }

    public static Boolean esNumero(char c) {
        Boolean chis = false;
        if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '7' || c == '8' || c == '9') {
            chis = true;
        }
        return chis;
    }

    public static Boolean abierto(char c) {
        Boolean chis = false;
        if (c == '(' || c == '[' || c == '{') {
            chis = true;
        }
        return chis;
    }

    public static String exp(ListaSimpleAvanzada lsa) {
        String cad = "";
        for (int i = 0; i < lsa.tamano(); i++) {
            cad += lsa.obtenerObjetopp(i);
        }
        return cad;
    }

    public static String expSep(ListaSimpleAvanzada lsa) {
        String cad = "";
        for (int i = 0; i < lsa.tamano(); i++) {
            cad += lsa.obtenerObjetopp(i) + ",";
        }
        return cad;
    }

    public static ListaSimpleAvanzada obtenerListaCaracteres(ListaSimpleAvanzada ls) {
        ListaSimpleAvanzada par = new ListaSimpleAvanzada();
        String cadena = exp(ls);
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (abierto(c) || c == ')' || c == ']' || c == '}') {
                par.insertar(c);
            }
        }
        return par;
    }

    public static Boolean corresp(char a, char b) {
        Boolean c = false;
        switch (a) {
            case '(':
                if (b == ')') {
                    c = true;
                }
                break;
            case '[':
                if (b == ']') {
                    c = true;
                }
                break;
            default:
                if (b == '}') {
                    c = true;
                }
                break;
        }
        return c;
    }

    public static Boolean estaBalenceada(ListaSimpleAvanzada expresion) {
        Boolean chis = false;
        if (!existenCorchetes(expresion)) {
//            JOptionPane.showMessageDialog(null, "la expresion no tiene (){}[]");
            return false;
        }
//        if (!(expresion.existe('(') || expresion.existe('[') || expresion.existe('{')
//                || expresion.existe(')') || expresion.existe(']') || expresion.existe('}'))) {
//            JOptionPane.showMessageDialog(null, "la expresion no tiene (){}[]");
//            return false;
//        }
        try {
            String tmp = exp(obtenerListaCaracteres(expresion));
            ListaSimpleAvanzada pila = new ListaSimpleAvanzada();
            pila.insertarPila(tmp.charAt(0));
            int it = 1;
            char c;
            while (it < tmp.length()) {
                c = tmp.charAt(it);
                if (abierto(c)) {
                    pila.insertarPila(c);
                } else {
                    char ant = (char) pila.obtenerObjetopp(0);
                    if (corresp(ant, c)) {
                        pila.emilinarDpp(0);
                    }
                }
                it++;
            }
            if (pila.tamano() == 0) {
                chis = true;
            }
        } catch (Exception e) {
            System.err.println("Ocurrio un error en estaBalanceada");
            return false;
        }
        if (!chis) {
            JOptionPane.showMessageDialog(null, ("La expresion no esta balanceada"));
        }
        return chis;
    }

//    public static Boolean llaves(ListaSimpleAvanzada lsa){
//        Boolean chis = false;
//        String cadena = exp(lsa);
//        for (int i = 0; i < cadena.length(); i++) {
//            char c = cadena.charAt(i);
//            if () {
//                
//            }
//        }
//    }
    public static Boolean existenCorchetes(ListaSimpleAvanzada expresion) {
        Boolean b = false;
        int parA = 0, parC = 0;
        int corA = 0, corC = 0;
        int llaA = 0, llaC = 0;
        for (int i = 0; i < expresion.tamano(); i++) {
            String cad = String.valueOf(expresion.obtenerObjetopp(i));
            char c = cad.charAt(0);
            switch (c) {
                case '(':
                    parA++;
                    break;
                case ')':
                    parC++;
                    break;
                case '[':
                    corA++;
                    break;
                case ']':
                    corC++;
                    break;
                case '{':
                    llaA++;
                    break;
                case '}':
                    llaC++;
                    break;
                default:
                    break;
            }
        }
        Boolean b1 = comp(parA, parC, 0),
                b2 = comp(corA, corC, 1),
                b3 = comp(llaA, llaC, 2);

        if (b1 && b2 && b3) {
//            JOptionPane.showMessageDialog(null, "La exprecion esta correcta");
            b = true;
        }
        int sum = parA + parC + corA + corC + llaA + llaC;
//        if (sum>0) {
//            b=true;
//        }
        return b;
    }

    private static Boolean comp(int a, int b, int s) {
        String[] nom = {"parentesis", "corchetes", "llaves"};
        Boolean chis = false;
        if (a == b) {
            System.out.println(nom[s] + " correctos");
            chis = true;
        } else if (a > b) {
            JOptionPane.showMessageDialog(null, "Faltan " + (a - b) + " " + nom[s] + " de cierre");
        } else {
            JOptionPane.showMessageDialog(null, "Faltan " + (b - a) + " " + nom[s] + " de apertura");
        }
        return chis;
    }

    public static int idCaso(char c, ListaSimpleAvanzada pila) {
        String cade = String.valueOf(pila.obtenerObjetopp(1));
        char pre = cade.charAt(0);
        if (abierto(pre)) {
            return 5;
        }
        if (c == '+' || c == '-') {
            if (pre == '+' || pre == '-') {
                return 0;
            } else {
                return 2;
            }
        } else {
            if (pre == '+' || pre == '-') {
                return 1;
            } else {
                return 0;
            }
        }
    }

    private static double operacion(char c, Object o, Object o1) {
//        int a = obtenerObjetopp;
//        int b = obtenerObjetopp0;
        String s = String.valueOf(o);
        String s1 = String.valueOf(o1);
        double a=0,b=0;
        if (o instanceof Integer) {
            a = Integer.valueOf(s);
        } else {
            a = Double.valueOf(s);
        }
        if (o1 instanceof Integer) {
            b = Integer.valueOf(s1);
        } else {
            b = Double.valueOf(s1);
        }
        return switch (c) {
            case '+' ->
                a + b;
            case '-' ->
                a - b;
            case '*' ->
                a * b;
            case '/' ->
                a / b;
            default ->
                0;
        };
//        return 1.2;
    }
}
