/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cajero;

/**
 *
 * @author Willian
 */
public class Cajero {
    private int tiempo;
    private int num_Clientes;
    private int tiempo_Total;

    public Cajero() {
    }
    

    public Cajero(int tiempo, int num_Clientes, int tiempo_Total) {
        this.tiempo = tiempo;
        this.num_Clientes = num_Clientes;
        this.tiempo_Total = tiempo_Total;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getNum_Clientes() {
        return num_Clientes;
    }

    public void setNum_Clientes(int num_Clientes) {
        this.num_Clientes = num_Clientes;
    }

    public int getTiempo_Total() {
        return tiempo_Total;
    }

    public void setTiempo_Total(int tiempo_Total) {
        this.tiempo_Total = tiempo_Total;
    }

    @Override
    public String toString() {
        return "Nro clientes atendidos: "+num_Clientes+" tiempo total: "+tiempo_Total;
    }
    
    
    
}
