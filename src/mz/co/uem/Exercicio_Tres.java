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
public class Exercicio_Tres {
    
    public static void main(String[] args) {

        
        System.out.println("Result: "+soma(555));
    }
    
    private static int soma(int i){
        if(String.valueOf(i).length() == 1)
            return i;
        
        String nr = String.valueOf(i).charAt(0)+"";
        return Integer.parseInt(nr) 
                + soma(Integer.parseInt((""+i).replaceFirst(nr, "")));
        
    }
}
