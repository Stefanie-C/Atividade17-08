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
       this.numero = numero;
       this.nome = nome;
       this.saldo = saldo;
       this.limiteSaque = limiteSaque;
       
    }
    
    
    public void depositar (double valor_depositado) {
        this.saldo += valor_depositado;
    }
    
    public void sacar (double valor_saque) throws ExcecaoPersonalizada {
        if (valor_saque > limiteSaque){
            throw new ExcecaoPersonalizada ("NÃO FOI POSSÍVEL REALIZAR O SAQUE."
                    + "O VALOR DE SAQUE NÃO PODE SER MAIOR QUE O LIMITE.");
        }else if (valor_saque > saldo){
             throw new ExcecaoPersonalizada ("NÃO FOI POSSÍVEL REALIZAR O SAQUE."
                    + "A CONTA NÃO POSSUI SALDO DISPONÍVEL.");
        }else{
           
        }
        
        saldo -= valor_saque;
        System.out.println("SAQUE REALIZADO COM SUCESSO! O VALOR RETIRADO FOI: R$ " + valor_saque);
        System.out.println("O NOVO VALOR DISPONÍVEL PARA SAQUE É: " +saldo);
    }
    
    public void limiteSaque (double limiteSaque){
        this.limiteSaque += limiteSaque;
    }
    
    public void imprimir (){
        System.out.println(" ");
        System.out.println(" *** Imprimindo Dados da Conta *** ");
        System.out.println(" ");
        System.out.println("Número: " +this.numero);
        System.out.println("Nome: " +this.nome);
        System.out.println("Saldo Inicial: " +this.saldo);
        System.out.println("Limite Saque: " +this.limiteSaque);
    }
    
}
