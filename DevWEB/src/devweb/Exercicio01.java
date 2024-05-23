package devweb;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, soma, sub, mult;
       
        System.out.println("Digite o primeiro numero:");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        n2 = sc.nextInt();
        
        soma = n1 + n2;
        System.out.println("O resultado da soma eh " + soma);
   
        sub = n1 - n2;
        System.out.println("O resultado da subtracao eh " + sub);
        
        mult = n1 * n2;
        System.out.println("O resultado da multiplicacao eh " + mult);
        
    }
    
}
