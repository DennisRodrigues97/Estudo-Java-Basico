package br.com.javadio.controlefluxo;

import java.util.Scanner;

public class ExerParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros = 0;
        int contador = 0;
        int numero = 0;
        int numeroPar = 0, numeroImpar = 0;

        System.out.println("Quantos números: ");
        quantidadeNumeros = scan.nextInt();

        do{
            System.out.println("Digite número: ");
            numero = scan.nextInt();
            numero = (numero % 2 == 0) ? numeroPar++ : numeroImpar++;
            contador++;
        }while (contador < quantidadeNumeros);
        System.out.println("Quantidade de números pares: " + numeroPar);
        System.out.println("Quantidade de números ímpares: " + numeroImpar);
    }
}