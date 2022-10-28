package br.com.javadio.controlefluxo;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class ExerNota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Diga uma nota entre 0 e 10");
        int nota = scan.nextInt();
        
        while (nota < 0 | nota > 10)  {
                System.out.println("Nota invalida, digite novamente: ");
                nota = scan.nextInt();            
        }
    }
    
}


