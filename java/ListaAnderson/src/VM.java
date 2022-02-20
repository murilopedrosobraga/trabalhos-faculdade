import java.util.Scanner;

public class VM {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int val = teclado.nextInt();

        if(val % 2 == 0)
            System.out.println("Numero par, logo, seu quadrado e: " + (val*val));
        else
            System.out.println("Numero impar, logo, seu cubo e: " + (val*val*val));
            
        teclado.close();
    } 
}
