/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.uem;

/**
 *
 * @author Alfredo
 */
public class Exercicio_Quatro {
    public static void main(String[] args) {
        int k;
        int num;

        k = 7;
        num = 175767547;

        System.out.println("O Digito " + k + " Ocorre " + numeroDeVezes(num, k, 0) + " vezes" + " em " + num);
    }

    private static int numeroDeVezes(int i, int j, int cont) {

        String nr = String.valueOf(i).charAt(0) + "";

        if (String.valueOf(i).length() == 1) {
            if (Integer.parseInt(nr) == j) {
                cont++;
            }

            return cont;
        }

        if (Integer.parseInt(nr) == j) {
            return numeroDeVezes(Integer.parseInt(("" + i).replaceFirst(nr, "")), j, cont + 1);
        }

        return numeroDeVezes(Integer.parseInt(("" + i).replaceFirst(nr, "")), j, cont);
    }

}
