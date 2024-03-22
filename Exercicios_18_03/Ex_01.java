import java.util.Scanner;
public class Exercicio01
{
   public static void main(String args[]){
       Scanner dados = new Scanner (System.in);
       int op;
       double n1,n2;
       
       System.out.println("Digite o 1º número: ");
       n1 = dados.nextDouble();
       System.out.println("Digite o 2º número: ");
       n2 = dados.nextDouble();
       System.out.println("Aqui estão as operações que você pode realizar:");
       System.out.println("1. Adição;");
       System.out.println("2. Subtração;");
       System.out.println("3. Multiplicação;");
       System.out.println("4. Divisão;");
       System.out.print("Digite a sua escolha (1|2|3|4): ");
       op = dados.nextInt();
    
        if (op==1){
   System.out.println("Resultado: "+(n1+n2));
}else if (op==2){
   System.out.println("Resultado: "+(n1-n2));
}else if (op==3){
   System.out.println("Resultado: "+(n1*n2));
}else if (op==4){
   System.out.println("Resultado: "+(n1/n2));
}else
System.out.println("Erro!!! Digite uma operação válida");
}
}