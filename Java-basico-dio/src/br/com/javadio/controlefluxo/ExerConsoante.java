package br.com.javadio.controlefluxo;

import java.util.Scanner;

public class ExerConsoante{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String [6];
        int numConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            if 
            (!(letra.equalsIgnoreCase("a")) | 
            (letra.equalsIgnoreCase("e")) | 
            (letra.equalsIgnoreCase("i")) | 
            (letra.equalsIgnoreCase("o")) |
            (letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                numConsoantes++;
            }
            count++;
        }while(count < consoantes.length); 

        for (String string : consoantes) {
            if (string != null)
            System.out.println(string.format(string, args));
            System.out.println("Num consoantes: " + numConsoantes);
        }
    }
}