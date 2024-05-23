package poo;
public class Main2 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        
        conta1.nomeTitular = "Diogo";
        conta1.saldo = 100.0;
        
        System.out.println("O cliente " + conta1.nomeTitular + " tem o saldo de " + conta1.saldo);
        
        conta1.sacar(50);
        
        System.out.println("O cliente " + conta1.nomeTitular + " possui agora o saldo de " + conta1.saldo);

    }
}
