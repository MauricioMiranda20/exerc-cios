
package maintes7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float a,b;
        String res;
        
        Scanner escrever = new Scanner(System.in);
        
        //System.out.print("Qual é seu peso: ");
        //a = escrever.nextFloat();
        
        //System.out.print("Qual é sua altura: ");
        //b = escrever.nextFloat();
        
        Avaliacao avaliacao = new Avaliacao(75.34,1.83);
        
        System.out.println(avaliacao.getPeso());
        System.out.println(avaliacao.getAltura());
        System.out.println(avaliacao.indice());
        System.out.println(avaliacao.classificacao());
        
        res = avaliacao.classificacao();
        System.out.println("Voce ta :"+res);

    }
    
}
