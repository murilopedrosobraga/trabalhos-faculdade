import java.util.Scanner;

public class vetores {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = 10;
        int i;
        int x = 0;
        int escolha, indice = 0;
        int valor = 0;
        int possui = 0;

        int numero[] = new int[n];
        int repetir[] = new int[n];
        int par[] = new int[n];
        int impar[] = new int[n];
        int resultado[] = new int[n];

        for(i=0; i<n; i++){
            System.out.println("Valor a ser atribuido na soma de 10 indices");
            numero[i] = teclado.nextInt();
        }

        for(i=0; i<n; i++){
            System.out.print(numero[i] + ", ");
        }

        System.out.println(" ");

        for(i=0; i<n; i++){
            repetir[i] = numero[i];
        }

        for(i=0; i<n; i++){
            resultado[i] = repetir[i] * numero[i];

            if(resultado[i] % 2 == 0){
                par[x] = resultado[i];
                System.out.println(par[x]); x++;
            }else{
                impar[i] = resultado[i];
            }
        }

        int soma = 0;

        for(i=0; i<n; i++){
            soma = soma + numero[i];
        }

        System.out.println(" ");
        System.out.println("Procurar algum valor especifico?: ");
        System.out.println("1-Sim");
        System.out.println("2-Nao");
        escolha = teclado.nextInt();

        switch(escolha) {

            case 1:
                ;
                System.out.println("Valor que deseja encontrar: ");
                valor = teclado.nextInt();

                for (i = 0; i < n; i++) {
                    if (numero[i] == valor) {
                         possui = valor;
                         indice = i;
                    }
                }

                if (possui != 0) {
                    System.out.println("Valor encontrado: " + possui + ", Indice:  " + indice);
                } else {
                    System.out.println("Valor não encontrado");
                }

                break;

            case 2:
                ;
                break;

        }

        System.out.println(" ");
        System.out.println("Soma dos 10 valores resultou em: " + soma);

        teclado.close();
    }
}