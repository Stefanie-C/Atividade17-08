/**
 *
 * @author Stéfanie
 */

package Atividade;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limiteSaque;
    private double valor_saque;

    Conta(int numero, String nome, double saldo, double limiteSaque) {
       
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    
    
    public void depositar (double valor_depositado) {
        this.saldo += valor_depositado;
    }
    
    public void limiteSaque (double limiteSaque){
        this.limiteSaque += limiteSaque;
    }
    
    public void imprimir (){
        System.out.println(" ");
        System.out.println(" *** Dados da Conta *** ");
        System.out.println(" ");
        System.out.println("Número: " +this.numero);
        System.out.println("Nome: " +this.nome);
        System.out.println("Saldo Inicial: " +this.saldo);
        System.out.println("Limite Saque: " +this.limiteSaque);
    }
    
}
