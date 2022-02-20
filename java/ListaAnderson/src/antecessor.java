import java.util.Scanner;

public class antecessor {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira um valor: ");
        int val = teclado.nextInt();

        System.out.println("O valor " + val + ", tem como seu antecessor o numero: " + (val-1));

        teclado.close();
    }
}
