/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.SumaRecursiva;

import Controlador.ListaSimpleAvanzada;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Willian
 */
public class ModeloTabRec extends AbstractTableModel {
    private ListaSimpleAvanzada lista = new ListaSimpleAvanzada();

    public ListaSimpleAvanzada getLista() {
        return lista;
    }

    public void setLista(ListaSimpleAvanzada lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.tamano();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        if (i1==0) {
            return i+1+".";
        } else {
            return lista.obtenerObjetopp(i);
        }
    }

    @Override
    public String getColumnName(int column) {
        if (column==0) {
            return "Nro";
        } else {
            return "Numero";
        }
    }
    
    
}
