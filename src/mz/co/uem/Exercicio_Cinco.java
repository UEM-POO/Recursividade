
package mz.co.uem;

import java.util.Vector;

/**
 *  1. meotod que retorna os carracteres
 *  2. Sortear as elementos
 *  3. Precisamos que retorna a qtd total de elementos que devem existir na nossa combinacao
 *  4. Precisamos de um fazer as chamadas recursivas.
 * 
 * @author José Seie
 * @author Alfredo Sebastiao
 * @version 1.0
 */
public class Exercicio_Cinco {
    //
    private static String combinacoes(int totalCombinacoes,String combinados,String caracteres){
       if( i2 == 0 )
           return 0;
     
        return ""
    }
    
    private static String[] elementos(String str){
        
    }
    
    private static String caracteres(int total){
        return ("ABCDEFGHIJKLMNOPQR").substring(0,total);
    }
    
    private static int totalElementos(int n){
        if(n == 1) return n;
        if(n > 0)  return n * totalElementos(n-1);        
        return -1;
    }
    
    
    public static void main(String[] args) {
//        System.out.println(caracteres(4));
        System.out.println(totalElementos(0));
        
    }
    
    /*
    Rascunho:
    
    2: AB, BA
    3: ABC, ACB, BAC, BCA, CAB, CBA
    
    */
    
}