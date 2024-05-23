package devweb;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite o primeiro numero: ");
        n2 = sc.nextInt();
        
        if(n1>n2){
            System.out.println("O numero " + n1 +" eh maior.");
            System.out.println("O numero " + n2 +" eh menor.");
        }
        else if(n1==n2){
            System.out.println("Numeros iguais.");
        }
        else{
            System.out.println("O numero " + n2 + " eh maior");
            System.out.println("O numero " + n1 +" eh menor.");
        }
    }
    
}
