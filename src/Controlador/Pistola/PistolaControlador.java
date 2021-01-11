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
public class PistolaControlador {

    private ListaCircular lc = new ListaCircular();
    private PersonaP persona;

    public void jugar() {
        try {
            while (lc.tamano() != 1) {
                int posicion=UtilesPistola.tienePistola(lc);
                PersonaP p = (PersonaP) lc.obtenerDpp(posicion + 2);
                p.setPistola(true);
                PersonaP px = (PersonaP) lc.obtenerDpp(posicion);
                px.setPistola(false);
                System.out.println("Eliminado -> "+lc.obtenerDpp(posicion+1));
                lc.eliminarDpp(posicion+1);
            }
        } catch (Exception e) {
            System.err.println("Error al jugar - jugar()\n"+e);
        }
    }

    public Boolean addPersona() {
        try {
            PersonaP x = new PersonaP(persona.getNombre(), persona.getPistola());
            lc.insertar(x);
            setPersona(null);
            return true;
        } catch (Exception e) {
            System.err.println("No se inserto la persona en la lista circular - addPersona()\n" + e);
            return false;
        }
    }

    public ListaCircular getLc() {
        return lc;
    }

    public void setLc(ListaCircular lc) {
        this.lc = lc;
    }

    public PersonaP getPersona() {
        if (this.persona == null) {
            this.persona = new PersonaP();
        }
        return persona;
    }

    public void setPersona(PersonaP persona) {
        this.persona = persona;
    }

}
