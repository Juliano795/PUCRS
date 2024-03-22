import java.util.Scanner;
public class Exercicio05
{
    public static void main(String args[]){
        Scanner dados = new Scanner (System.in);
        int idade;
        
        System.out.println("Digite a idade do nadador: ");
        idade = dados.nextInt();
        
        if (idade>=5){
            System.out.println("O nadador é infantil A entre 5 e 7 anos");
        }else if (idade>=8){
            System.out.println("O nadador é infantil B entre 8 e 10 anos");
        }else if (idade>=11){
            System.out.println("O nadador é juvenil A entre 11 e 13 anos");
        }else if (idade>=14){
            System.out.println("O nadador é juvenil B entre 14 e 17 anos");
        }else if (idade>=18){
            System.out.println("O nadador é adulto maior de 18 anos"); 
        }else
            System.out.println("Erro!! Idade inválida");
        }
    }
