package devweb;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int soma=0;
        do{
            System.out.println("Digite um numero:");
            num = sc.nextInt();
            soma = soma+num;
        }while(num!=0);
        System.out.println("A soma dos numeros deu " + soma);
        }
        
    }
    

