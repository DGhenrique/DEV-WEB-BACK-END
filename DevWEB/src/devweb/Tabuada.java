package devweb;

import java.util.Scanner;


public class Tabuada {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 0 a 10: ");
       int numero = sc.nextInt();
       
       if(numero >=0 && numero <=10){
           System.out.println("Tabuada do " + numero + " : ");
           
           for(int i=0; i<=10;i++){
               int resultado = numero * i;
               System.out.println(numero + " x " + i + " = " + resultado);
           }
       }
       else {
           System.out.println("Numero Invalido, tente novamente.");
       }
       
       sc.close();
       
}
}
