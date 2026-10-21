import java.util.Random;

public class NumAleatorio {
    public int numAleatorio(int numMax) {
        if (numMax < 1) {
            return 0;
        }
        Random rand = new Random();
        int resultado = rand.nextInt(numMax) + 1;

        System.out.println("El número aleatorio es: " + resultado);
        return resultado;
    }
}
