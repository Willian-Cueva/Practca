/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.InvertirLista;

import Controlador.ListaSimpleAvanzada;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Willian
 */
public class ModeloInvertir extends AbstractTableModel{
    private ListaSimpleAvanzada lsa = new ListaSimpleAvanzada();

    public ListaSimpleAvanzada getLsa() {
        return lsa;
    }

    public void setLsa(ListaSimpleAvanzada lsa) {
        this.lsa = lsa;
    }
    
    @Override
    public int getRowCount() {
        return lsa.tamano();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        if (i1==0) {
            return i+1;
        } else {
            return lsa.obtenerObjetopp(i);
        }
    }

    @Override
    public String getColumnName(int column) {
        if (column==0) {
            return "Nro";
        } else {
            return "Nombres";
        }
    }
    
    
}
