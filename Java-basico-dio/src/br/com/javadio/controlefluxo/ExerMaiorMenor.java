package br.com.javadio.controlefluxo;

import java.util.Scanner;

public class ExerMaiorMenor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros;
        int maior = 0;
        int contador = 0;
        int soma = 0;

        do {
            System.out.println("Digite o número: ");
            numeros = scan.nextInt();
            contador += 1;
            if (numeros > maior) maior = numeros; 
            soma += numeros;

        }while (contador < 5);

        System.out.println("Número maior: " + maior);
        System.out.println("Média: " + (soma / contador));
    }

}