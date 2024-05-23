package devweb;
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, resultado;
        
        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextInt();
        resultado = n1 * n2;
        System.out.println("O resultado da soma eh "+ resultado);
        
    }
    
}
