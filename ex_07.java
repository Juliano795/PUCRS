import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        double sm,vc;

        System.out.print("Digite o saldo médio do cliente: ");
        sm = dados.nextDouble();
        
        vc = 0;
        if (sm >= 601) {
            vc = sm * 0.4;
        } else if (sm >= 401) {
            vc = sm * 0.3;
        } else if (sm >= 201) {
            vc = sm * 0.2;
        }
        System.out.println("O saldo médio do cliente é: R$" + sm);
        System.out.println("O valor do crédito é: R$" + vc);
    }
}
