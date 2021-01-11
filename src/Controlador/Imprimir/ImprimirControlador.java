/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Imprimir;

import Controlador.ListaSimpleAvanzada;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Willian
 */
public class ImprimirControlador {

    private ListaSimpleAvanzada cola = new ListaSimpleAvanzada();

    public void imprimir() {
        File f = new File("Imprimir.txt");

        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = null;
            while ((linea = br.readLine()) != null) {
                System.out.println("se esta leyendo -> '"+linea+"' del Archivo");
                cola.insertar(linea);
                System.out.println("espere porvafor unos segundos");
                try {
                    Thread.sleep(5 * 1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            fr.close();
            System.out.println("*************   Cola   *************");
            cola.present();
        } catch (FileNotFoundException ex) {
            System.err.println("No se pudo encontrar el archivo Imprimir.txt - imprimir()\n" + ex);
        } catch (IOException ex) {
            System.err.println("Error al leer linea del archivo - imprimir()\n" + ex);
        }

    }

}
