/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Pistola;

import Controlador.Pistola.ListaCircular;
import Modelo.Pistola.PersonaP;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Willian
 */
public class TablaModeloListaCircular extends AbstractTableModel {

    private ListaCircular lc = new ListaCircular();

    public ListaCircular getLc() {
        return lc;
    }

    public void setLc(ListaCircular lc) {
        this.lc = lc;
    }

    @Override
    public int getRowCount() {
        return lc.tamano();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        if (lc.estaVacia()) {
            return "Vacio";
        } else {
            PersonaP p = (PersonaP) lc.obtenerDpp(i);
            switch(i1){
                case 0: return (i+1);
                case 1: return p.getNombre();
                case 2: return (p.getPistola())?"PISTOLA":"NO LA TIENE";
                default: return "";
            }
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "No";
            case 1: return "Nombre";
            case 2: return "Pistola";
            default: return "Error";
        }
    }
    

}
