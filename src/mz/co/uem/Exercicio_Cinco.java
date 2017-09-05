
package mz.co.uem;

import java.util.Random;
import javax.swing.JOptionPane;

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

        if(combinados.split(", ").length == totalCombinacoes)
           return combinados;
        
        StringBuilder sb = new StringBuilder(); 
        String nc = novaCombinacao(caracteres);
        
        if(!combinados.contains(nc) || !combinados.matches("["+nc+"]"))
            combinados = String.valueOf(sb.append(combinados).append(nc).append(", "));

        
        System.out.println("Impressao: "+combinados);
        return  String.valueOf(sb) + combinacoes(totalCombinacoes, combinados, caracteres);
    }
    
    private static String novaCombinacao(String caracteres){
        char[] a = caracteres.toCharArray();
        Random gerador = new Random();
        String s = "";
        while(s.length() != caracteres.length()) {  
            
            String novoChar = a[gerador.nextInt(a.length)]+"";
            if(!s.contains(novoChar))
                s += novoChar;
//            System.out.println("a " +s);
        }
        return s;
    }
    
    private static String caracteres(int total){
        return ("ABCDEFGHIJKLMNOPQR").substring(0,total);
    }
    
    private static int totalElementos(int n){
        if(n == 1) return n;
        if(n > 0)  return n * totalElementos(n-1);        
        return -1;
    }
    
    public static void combinacoesDeLetras(){
        String s = JOptionPane.showInputDialog("Quantas primeiras letras desejas combinar?");
        int letras = Integer.parseInt(s);

        String ss = combinacoes(totalElementos(letras), "", caracteres(letras));
        System.out.println("As combinacoes sao: "+ss);
        
    }
    
    
    public static void main(String[] args) {
//        System.out.println(caracteres(4));
        combinacoesDeLetras();
//        System.out.println(totalElementos(0));
        
    }
    
    /*
    Rascunho:
    
    2: AB, BA
    3: ABC, ACB, BAC, BCA, CAB, CBA
    
    */
    
}
