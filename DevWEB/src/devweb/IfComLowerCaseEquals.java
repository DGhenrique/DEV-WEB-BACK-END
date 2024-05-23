package devweb;

import java.util.Scanner;

public class IfComLowerCaseEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Insira o seu nome: ");
        nome = sc.nextLine();
        
        System.out.println("O nome digitado foi: " + nome);
        
        System.out.println("");
        
        if(nome.toLowerCase().equals("diogo")){
            System.out.println("O nome eh Diogo");
        }
        else{
            System.out.println("O nome nao eh Diogo");
        }
        
        
    }
    
}
