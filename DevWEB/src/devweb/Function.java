package devweb;

public class Function {
    public static void main(String[] args) {
        int soma = somaValores(5, 9);
        System.out.println(soma);
    }

    public static void mostrarMensagem() {
        System.out.println("Minha primeira funcao");
    }
    
    public static int somaValores(int valor1, int valor2) {
        int soma = valor1 + valor2;
        return soma;
    }
}
