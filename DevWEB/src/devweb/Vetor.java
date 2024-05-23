package devweb;
import java.util.Scanner;
public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota[] = new double[3];
        double soma = 0;
        double media;
        for(int i = 0; i<nota.length;i++){
        System.out.println("Informe a sua nota:");
        nota[i] = sc.nextInt();
        }
        for(int i=0;i<nota.length;i++){
            System.out.println(nota[i]);
        }
        
        for(int i=0;i<nota.length;i++){
        soma += nota[i];
        }
        
        media = soma/nota.length;
        
        System.out.println("A sua media eh "+ media);
    }
}
