import java.text.DecimalFormat;
import java.util.Scanner;

public class saldo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.println("Digite o saldo inicial: ");
        double saldoInit = teclado.nextDouble();
        System.out.println("%n");

        System.out.println("Digite a quantidade de creditos: ");
        double credito = teclado.nextDouble();
        System.out.println("%n");

        System.out.println("Digite a quantidade de debitos: ");
        double debito = teclado.nextDouble();
        System.out.println("%n");

        saldoInit = saldoInit + credito - debito;
        
        if(saldoInit>0)
            System.out.println("Saldo positivo de: R$" + numberFormat.format(saldoInit));
        else if(saldoInit<0)
            System.out.println("Saldo negativo de: -R$" + numberFormat.format(Math.abs(saldoInit)));
        else
            System.out.println("Saldo zero");

        teclado.close();
    }
}