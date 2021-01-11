/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Balance;

import Controlador.Balance.BalanceControlador;
import Controlador.Balance.UtilesBalance;

/**
 *
 * @author Willian
 */
public class Main {
    public static void main(String[] args) {
        BalanceControlador bc = new BalanceControlador();
        String exp = "2+3)[34)+3*4]";
        bc.setExpresion(UtilesBalance.convExpre(exp));
        bc.balance();
    }
}
