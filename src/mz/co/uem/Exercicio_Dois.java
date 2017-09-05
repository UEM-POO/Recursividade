/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.uem;

/**
 *
 * @author José Seie
 */
public class Exercicio_Dois {
    public static void main(String[] args) {
        System.out.println("Multiplicacao: "+multiplica(4, 4));
    }
    
    private static double multiplica(int i,int i2){
       if(i2 == 0 )
           return 0;
     
        return i+multiplica(i, i2-1);
    }
}
