import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opt = 0;
        int total = 0;
        int arr[] = new int[5];

        while (opt != 9) {
            System.out.println("1- Adicionar quantidade produzida");
            System.out.println("2- Quantidade total produzida");
            System.out.println("3- Maior quantidade produzida em um dia");
            System.out.println("4- Menor quantidade produzida em um dia");
            System.out.println("9- Sair");
            opt = teclado.nextInt();
            switch (opt) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("Adicione a quantidade produzida: ");
                        arr[i] = teclado.nextInt();
                        total = arr[i];
                        if (total == -1) {
                            System.out.println("Saindo da operação!");
                            break;
                        }
                    }
                    break;
                case 2:
                    int soma = 0;
                    for (int i = 0; i < arr.length; i++) {
                        soma = soma + arr[i];
                    }
                    System.out.println("Quantidade total produzida: " + soma);
                    break;
                case 3:
                    int max = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Maior valor produzido em um dia: " + max);
                    break;
                case 4:
                    int min = arr[0];
                    for (int i = 1; i < arr.length; i++)
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    System.out.println("Menor valor produzido em um dia: " + min);
                    break;

            }
            teclado.close();
        }
    }
}