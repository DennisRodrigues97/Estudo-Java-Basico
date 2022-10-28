package br.com.javadio.desafios;

import java.util.Scanner;

public class desafio01 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numeroA;
        int numeroB;

        System.out.println("Diga o primeiro número: ");
        numeroA = scan.nextInt();
        System.out.println("Agora o segundo: ");
        numeroB = scan.nextInt();
        
        
        if (numeroA == numeroB){
          System.out.println("São iguais!");
        }else {
          System.out.println("Não são iguais!");
        }

    }
}
