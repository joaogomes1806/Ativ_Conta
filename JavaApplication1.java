
package javaapplication1;


public class JavaApplication1 {


    public static void main(String[] args) {
     
        
        Conta conta = new Conta(12345,"Rodinei Ednaldo");
        
        System.out.println("===== Dados iniciais =====");
        conta.exibirDados();
        
        
        System.out.println("\n ==== Depositando R$120,00 ====");
        conta.depositar(500.0);
        conta.exibirDados();
        
        System.out.println("\n ==== Sacando R$242,00 ====");
         boolean sucesso1 = conta.sacar(242.0);
         
         System.out.println("\n === Consultando saldo diretamente ===");
         System.out.println("Saque Realizado?" + sucesso1);
         conta.exibirDados();
         
         System.out.println("\n=== Tentando sacar R$4000,00(saldo insuficiente)====");
         boolean sucesso2 = conta.sacar(4000.0);
         System.out.println("Saque Realizado?"+ sucesso2);
         conta.exibirDados();
         
         System.out.println("\n=== Consultando saldo diretamente ===");
         System.out.println("Saldo atual:"+ conta.consultarSaldo());
         System.out.println("Tentando depositar valor negativo");
         
         conta.depositar(-100.0);
         conta.exibirDados();
    }
    
}
