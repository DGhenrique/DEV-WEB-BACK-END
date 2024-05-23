package devweb;

import java.util.Scanner;

public class IfComLowerCaseEquals2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sexo;
        int idade;
        System.out.print("Informe o seu sexo: H (masculino) ou F (feminino): ");
        sexo = sc.nextLine();
        System.out.print("Informe a sua idade: ");
        idade = sc.nextInt();
        
        if(sexo.toLowerCase().equals("h")&& idade>=65){
            System.out.println("Voce pode se aposentar.");
        }
        else if (sexo.toLowerCase().equals("f") && idade>=62){
            System.out.println("Voce pode se aposentar.");
        }
        else{
            System.out.println("Voce nao pode se aposentar ainda.");
        }
        System.out.println("Seu sexo eh " + sexo + " e a sua idade eh "+ idade);
    }
}
