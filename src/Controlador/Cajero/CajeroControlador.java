/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Cajero;

import Controlador.ListaSimpleAvanzada;
import Controlador.Pistola.UtilesPistola;
import Modelo.Cajero.Cajero;
import Modelo.Cajero.Cliente;

/**
 *
 * @author Willian
 */
public class CajeroControlador {

    private ListaSimpleAvanzada cajeros = new ListaSimpleAvanzada();
    private ListaSimpleAvanzada clientes = new ListaSimpleAvanzada();

//    private Cajero cajero;
    public CajeroControlador() {
        cargarCajeros();
    }

    public void atender(){
        while (!clientes.estaVacia()) {            
            for (int i = 0; i < 4; i++) {
                if (clientes.estaVacia()) {
                    break;
                }
                Cliente c = (Cliente) clientes.obtenerObjetopp(0);
                Cajero cajero = (Cajero) cajeros.obtenerObjetopp(i);
//                int tm = c.getTiempo();
//                int sum=cajero.getTiempo_Total()+tm;
                cajero.setTiempo(c.getTiempo());
                cajero.setTiempo_Total(cajero.getTiempo_Total()+c.getTiempo());
//                int nc =cajero.getNum_Clientes()+1;
                cajero.setNum_Clientes(cajero.getNum_Clientes()+1);
                preInf(i,cajero,c);
                clientes.emilinarDpp(0);
            }
        }
    }
    
    public void informe(){
        System.out.println("++++++ CAJEROS ++++++");
        cajeros.present();
    }
    
    public Boolean generarClientes(int n) {
        try {
            for (int i = 0; i < n; i++) {
                int time = (int) Math.floor(Math.random() * 10 + 1);
                Cliente c = new Cliente(UtilesPistola.nombreAleatorio(), time);
                clientes.insertar(c);
            }
            clientes.present();
            return true;
        } catch (Exception e) {
            System.err.println("Error al generar los clientes generarlientes()\n" + e);
            return false;
        }
    }

    private void cargarCajeros() {
        for (int i = 0; i < 4; i++) {
            cajeros.insertar(new Cajero());
        }
    }

    public ListaSimpleAvanzada getCajeros() {
        return cajeros;
    }

    public void setCajeros(ListaSimpleAvanzada cajeros) {
        this.cajeros = cajeros;
    }

    public ListaSimpleAvanzada getClientes() {
        return clientes;
    }

    public void setClientes(ListaSimpleAvanzada clientes) {
        this.clientes = clientes;
    }

    private void preInf(int i,Cajero cajero, Cliente cliente) {
        System.out.println("Cajero nro "+(i+1)+"\nEsta atendiendo a "+cliente);
    }

}
