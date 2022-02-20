import java.util.Scanner;

public class DMY {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("------====== MANUAL ======------");
        System.out.println("Insira seus dados no modelo de");
        System.out.println("20 anos, 4 meses e 21 dias (exemplo)");
        System.out.println("%n");

        System.out.println("Insira sua idade apenas em anos: ");
        int ano = teclado.nextInt();

        System.out.println("Insira sua idade apenas em meses: ");
        int mes = teclado.nextInt();

        System.out.println("Insira sua idade apenas em dias: ");
        int dia = teclado.nextInt();

        ano = ano * 365;
        mes = mes * 30;
        dia = dia + mes + ano;

        System.out.println("Sua idade total em dias e: " + dia);
        
        teclado.close();
    }
}
