package devweb;

import java.util.Scanner;

public class IfElse {
     /* 
        == igualdade
        != diferença
        > maior
        < menor 
        >= maior ou igual
        <= menor ou igual
       */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota;
        
        System.out.println("Digite a nota: ");
        nota = sc.nextDouble();
        
        if(nota>=7){
            System.out.println("Aprovado!");
        }
        
        else if (nota==6){
            System.out.println("Recuperacao!");
        }
         else{
            System.out.println("Reprovado!");
        }
    }
    
}
