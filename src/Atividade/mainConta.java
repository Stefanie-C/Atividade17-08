/**
 *
 * @author Stéfanie
 */

package Atividade;


import java.util.Scanner;

public class mainConta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        
            try {
            System.out.println(" ");
            System.out.println(" *** Preenchendo Dados da Conta *** ");
            System.out.println(" ");
            
            System.out.println("Número: ");
            int numero = leitor.nextInt();
            System.out.println("Nome: ");
            String nome = leitor.next ();
            System.out.println("Saldo Inicial: ");
            double saldo = leitor.nextDouble();
            System.out.println("Limite de Saque: ");
            double limiteSaque = leitor.nextDouble();
            Conta teste = new Conta (numero, nome, saldo, limiteSaque);
            teste.imprimir();
            
            System.out.println(" ");
            System.out.println("Valor a ser Sacado: ");
            double valor_saque = leitor.nextDouble();
            teste.sacar(valor_saque);
            
            
            }catch (ExcecaoPersonalizada excecao){
                System.out.println(excecao.getMessage());
            }
            
            
    }
}
