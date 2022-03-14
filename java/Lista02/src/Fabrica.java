import java.lang.Math;
import java.text.DecimalFormat;

public class Fabrica {
    public static void main(String[] args) {
      
        DecimalFormat numberFormat = new DecimalFormat("#");

        int i;
        int ano = 365;

        for (i=0; i < 365; i++){
            double Producao = Math.random();
            Producao = Producao * 50;
            System.out.println("Random number: " + numberFormat.format(Producao));

        }
    }
}
