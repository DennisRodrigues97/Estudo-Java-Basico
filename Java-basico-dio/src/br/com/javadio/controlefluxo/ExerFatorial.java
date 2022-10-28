package br.com.javadio.controlefluxo;

import java.util.Scanner;

public class ExerFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial: ");
        int numFatorial = scan.nextInt();
        int multiplicacao = 1;

        for (int i = numFatorial; i >= 1; i-- ){
            multiplicacao = multiplicacao * i;
        }
        System.out.println("n! = " + multiplicacao);
    } 
}
