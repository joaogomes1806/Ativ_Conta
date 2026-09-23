public class Conta{

private int numero;
private double saldo;
private String nome;

public conta(int numero, String nome){
    this.numero = numero;
    this.nome = nome;
    this.saldo = 0.0
}
public void depositar(double valor ){
    if (valor > 0){
        this.saldo =+ valor;
    }
}
public bollean sacar(double valor){
    if(valor > 0 && this.saldo >= valor){
        return true;
    }
    return false
}
public double consultarSaldo(){
    return this.saldo;
}
public void exibirDados(){
    System.out.println("Número da conta: "+ this.numero);
     System.out.println("Titular: "+ this.nome);
      System.out.println("Saldo Atual: R$"+ this.saldo);
}
}