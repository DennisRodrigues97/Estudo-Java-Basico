package br.com.javadio.controlefluxo;

import java.util.Scanner;

public class ExerTabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Número da tabuada: ");
        int num = scan.nextInt();

        for (int contador = 1; contador < 10; contador++){
            int resultado = contador * num;
            System.out.println(contador + " x " + num + " = " + resultado);

        }
    }
}