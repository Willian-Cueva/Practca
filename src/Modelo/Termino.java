/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Willian
 */
public class Termino {
    private int coeficiente;
    private String variable;
    private int grado;

    public Termino() {
    }

    public Termino(int coeficiente, String variable, int grado) {
        this.coeficiente = coeficiente;
        this.variable = variable;
        this.grado = grado;
    }
    
    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return coeficiente+variable+"^"+grado;
    }
    
    
}
