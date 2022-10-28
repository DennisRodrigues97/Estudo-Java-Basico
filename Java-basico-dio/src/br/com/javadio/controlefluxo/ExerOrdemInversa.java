package br.com.javadio.controlefluxo;

public class ExerOrdemInversa {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 89, 98, 67, 67};
        
        for(int contador = lista.length -1; contador > -1; contador--){
            System.out.println(lista[contador]);
        }
        // int contador = lista.length - 1;
        // while(contador > -1){
        //      System.out.println(lista[contador]);
        //      contador--;
        // }
    }
}


