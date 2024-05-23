package devweb;

import java.util.Scanner;

public class NumeroUsuario {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Digite um numero: ");
        number = sc.nextInt();
        System.out.println("O numero digitado foi "+ number);
    }
    
}
