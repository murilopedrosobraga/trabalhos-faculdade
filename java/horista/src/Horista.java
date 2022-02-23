/*
Construir um programa em Java que faça o cálculo de um profissional que trabalhe por hora.
Solicitar a quantidade de horas trabalhadas no período e o valor da hora.

Cálculos
1- Salário bruto;
2- Total de Desconto(9%)
3- Salário Líquido
*/
import java.util.Scanner;

public class Horista {

    public static double calculoBruto(double hora, double salario){

        double totalBruto;
        totalBruto = hora * salario;
        return totalBruto;
    }
    public static double calculoDescontos(double total){

        double totalDescontos;
        totalDescontos = total * 0.09;
        return totalDescontos;
    }
    public static double calculoLiquido(double total){

        double totalLiquido;
        totalLiquido = total * 0.91;
        return totalLiquido;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de horas trabalhadas: ");
        double horas = teclado.nextDouble();

        System.out.print("Valor da hora de trabalho: ");
        double salario = teclado.nextDouble();

        double total = calculoBruto(horas, salario);
        double descontos = calculoDescontos(total);
        double liquido = calculoLiquido(total);

        System.out.println("Salario bruto: R$" + total);
        System.out.println("Valor descontado: R$" + descontos);
        System.out.println("Salário liquido: R$" + liquido);

        teclado.close();

    }
}