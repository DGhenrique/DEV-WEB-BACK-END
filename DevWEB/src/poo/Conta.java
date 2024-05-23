package poo;
public class Conta {
    String nomeTitular;
    double saldo;
    
    void sacar(double valor){
    this.saldo = this.saldo - valor;
    }
    
    double getSaldo() {
        return this.saldo;
    }
    
    void depositar(double valor){}
    
}
