import java.util.Scanner;
public class Exercicio06
{
    public static void main(String args[]){
        Scanner dados = new Scanner (System.in);
        int n;
        
        System.out.println("Digite o número inteiro: ");
        n = dados.nextInt();
        
        if (n%2==0){
            System.out.println(n+" é par");
        }else {
            System.out.println(n+" é ímpar");
        }if(n>0){
            System.out.println(n+" é positivo");
        }else if (n<0){
            System.out.println(n+" é negativo");
        }else
            System.out.println("Nem positivo e nem negativo | O número é zero");
}
}