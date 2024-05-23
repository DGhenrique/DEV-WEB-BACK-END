package poo;
public class ProjetoBanco {
    public static void main(String[] args) {
  /*ContaBancaria c1 = new ContaBancaria();
    ContaBancaria c2 = new ContaBancaria();*/
    ContaBancaria c1 = new ContaPoupanca();
    ContaBancaria c2 = new ContaPagamento();
    
    c1.nomeTitular = "Diogo";
    c1.numConta = 1;
    
    c2.nomeTitular = "Henrique";
    c2.numConta = 2;
    
    c1.Depositar(50);
    c2.Depositar(50);
    
    System.out.println("Saldo conta 1 = "+ c1.getSaldo());
    System.out.println("Saldo conta 2 = "+ c2.getSaldo());
    
    c1.Sacar(10);
    c2.Sacar(10);
    
    System.out.println("Saldo conta 1 apos saque = "+ c1.getSaldo());
    System.out.println("Saldo conta 2 apos saque = "+ c2.getSaldo());
    
        /* System.out.println(c1.nomeTitular);
        System.out.println(c1.getSaldo());
        
        c1.Depositar(50);
        System.out.println(c1.getSaldo());
        
        c1.Sacar(25);
        System.out.println("Apos saque o seu saldo agora eh " + c1.getSaldo());
        
        if(c1.transferir(c2, 20)==true){
            System.out.println("Transferencia realizada com sucesso");
        }
        else{
        System.out.println("Transferencia invalida (sem saldo)");

        }
        System.out.println("Saldo Conta 1 = "+ c1.getSaldo());
        System.out.println("Saldo Conta 2 = "+ c2.getSaldo());
        
        c2.Sacar(10);
        System.out.println("Saldo Conta 2 = "+c2.getSaldo()); */
    }
    
}

class ContaBancaria{
    public String nomeTitular;
    public int numConta;
    private double saldo;
    protected double taxaSaque=1.0;
    
public boolean Depositar(double valor) {
    this.saldo += valor;
    return true;
    }    

public boolean Sacar(double valor){
    if(valor+this.taxaSaque<=this.saldo){
        this.saldo = this.saldo - valor - this.taxaSaque;
        return true;
    }
    else{
        return false;
    }
    }
public double getSaldo(){
    return this.saldo;
}    

public boolean transferir(ContaBancaria contaDestino, double valor){
    if(this.Sacar(valor) == true){
        contaDestino.Depositar(valor);
        return true;
    }
    else{
        return false;   
    }
}
} 
class ContaPagamento extends ContaBancaria{
    public boolean Sacar(double valor){
    super.taxaSaque = 2.0;
    return super.Sacar(valor);
    }
}

class ContaPoupanca extends ContaBancaria{
    public boolean Sacar(double valor){
    super.taxaSaque = 0.50;
    return super.Sacar(valor);

    }

}
   

