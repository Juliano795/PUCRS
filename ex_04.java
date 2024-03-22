import java.util.Scanner;
public class Exercicio04
{
    public static void main(String args[]){
        Scanner dados = new Scanner (System.in);
        double v1,v2,v3;
        
        System.out.println("Digite o 1º valor: ");
        v1 = dados.nextDouble();
        System.out.println("Digite o 2º valor: ");
        v2 = dados.nextDouble();
        System.out.println("Digite o 3º valor: ");
        v3 = dados.nextDouble();
        
        if (v1>v2 && v1>v3){
            System.out.println("O maior valor é o 1º valor digitado: "+v1);
        }else if (v2>v1 && v2>v3){
            System.out.println("O maior valor é o 2º valor digitado: "+v2);
        }else if (v3>v1 && v3>v2){
            System.out.println("O maior valor é o 3º valor digitado: "+v3);
        }if (v1<v2 && v1<v3){
            System.out.println("O menor valor é o 1º valor digitado: "+v1);
        }else if (v2<v1 && v2<v3){
            System.out.println("O menor valor é o 2º valor digitado: "+v2);
        }else if (v3<v1 && v3<v2){
            System.out.println("O menor valor é o 3º valor digitado: "+v3);
        }else
        System.out.println("Erro!! Valores não podem ser todos iguais");
    }
}