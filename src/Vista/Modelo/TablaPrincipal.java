/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Modelo;

import Controlador.ListaSimpleAvanzada;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Willian
 */
public class TablaPrincipal extends AbstractTableModel{
    private ListaSimpleAvanzada lsa = new ListaSimpleAvanzada();

    public ListaSimpleAvanzada getLsa() {
        return lsa;
    }

    public void setLsa(ListaSimpleAvanzada lsa) {
        this.lsa = lsa;
    }
    
    @Override
    public int getRowCount() {
        return (lsa.estaVacia())?1:lsa.tamano();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        if (lsa.estaVacia()) {
            return "";
        }
        if (i1==0) {
            return i;
        } else{
            return lsa.obtenerObjetopp(i).toString();
        }
    }    

    @Override
    public String getColumnName(int column) {
        if (column==0) {
            return "Nro";
        } else {
            return "Nombre";
        }
    }
    
    
}
