/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.uem;

import javax.swing.JOptionPane;

/**
 *
 * @author José Seie
 */
public class Exercicio_Um {

    public static void main(String[] args) {
        
        String str = "Digite o numero para conversao: ";
        String rec = JOptionPane.showInputDialog(str);
        int  nr = Integer.parseInt(rec);
        
        if(nr == 0){
            System.out.println("0");
        }else{
            System.out.println(converteNr(nr));
        }
        
    }
    private static String str = "";

    private static String converteNr(int numero) {

        if (numero != 0) {
            converteNr(Math.abs(numero / 2));
        } else {
            return str;
        }
        

        str += "" + (numero % 2);
        return str;

    }

}
