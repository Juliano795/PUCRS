import java.util.Scanner;
public class Exercicio02
{
public static void main(String args[]){
    Scanner dados = new Scanner (System.in);
    
    double media, n1, n2;
    
    System.out.println("Digite a 1ª nota: ");
    n1 = dados.nextDouble();
    System.out.println("Digite a 2ª nota: ");
    n2 = dados.nextDouble();
    media = (n1+n2)/2;
    if (media>= 7){
    System.out.println("Aluno aprovado! :) ");
    }else if (media<6){
    System.out.println("Aluno reprovado! :( ");
    }else
System.out.println("Aluno em recuperação! :| ");
 }  
}