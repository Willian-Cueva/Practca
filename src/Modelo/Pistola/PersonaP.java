/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Pistola;

/**
 *
 * @author Willian
 */
public class PersonaP {
    private String Nombre;
    private Boolean pistola;

    public PersonaP() {
    }

    public PersonaP(String Nombre, Boolean pistola) {
        this.Nombre = Nombre;
        this.pistola = pistola;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Boolean getPistola() {
        return pistola;
    }

    public void setPistola(Boolean pistola) {
        this.pistola = pistola;
    }

    @Override
    public String toString() {
        return Nombre+" pistola-> "+pistola;
    }    
}
