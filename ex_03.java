import java.util.Scanner;
public class Exercicio03
{
    public static void main(String args[]){
        Scanner dados = new Scanner (System.in);
        double vs;
        
        System.out.print("Informe o valor desejado para sacar: R$ ");
        vs = dados.nextDouble();
        
        if (vs<=300){
            System.out.print("Saque realizado com sucesso");
        }else
        System.out.print("Saldo insuficiente");
        }
    }
