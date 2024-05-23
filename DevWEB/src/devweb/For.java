package devweb;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Informe um numero: ");
        number = sc.nextInt();
       
        for(int i=0;i<=10;i++){
            System.out.println(number + " x " + i + " = " + number * i);
        }
        
    }
    
}