package br.com.javadio.tiposvariaveis;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
     
        /*
        System.out.println("Hello, World!");

        constantes:
        final String MEU_NOME = "Dênnis"; 
        System.out.println(MEU_NOME);

        incrementação:
        int numero = 3;
        numero ++;
        System.out.println(++numero);
        
        operador de negação:
        boolean hhh = true;
        hhh = !hhh;
        System.out.println(hhh);
       */
       /*  
       int x = 6;
       int y = 5;
       String resultado = x==y ? "ok":"errado";
       /*if (x == y)
        resultado = "OK";
       else
        resultado = "NOK";
        */

        int resultado = 34;

        if (resultado > 3)
            System.out.println("BIGZAO");
        switch (resultado){
            case 3:
            break;
            case 34:
            resultado = ++resultado;


            }
        
        System.out.println(resultado);
       
    }    
    
}
