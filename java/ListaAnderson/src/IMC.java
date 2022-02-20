import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        double peso = teclado.nextDouble();
        
        System.out.println("Digite a altura: ");
        double altura = teclado.nextDouble();
        
        double imc;
        imc = peso / Math.pow(altura, 2);

        System.out.println("IMC e: " + imc);

        if(imc < 18.5)
            System.out.println("Abaixo do peso");
        else if (imc >= 18.6 && imc <= 25)
            System.out.println("Peso normal");
        else if (imc >= 25.1 && imc <= 30)
            System.out.println("Sobrepeso");
        else if (imc >= 30.1 && imc <= 35)
            System.out.println("Obeso leve");
        else if (imc >= 35.1 && imc <= 40)
            System.out.println("Obeso moderado");   
        else
            System.out.println("Obeso morbido");

    }
}


