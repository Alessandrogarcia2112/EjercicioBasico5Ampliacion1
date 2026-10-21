import java.util.Random;

public class NumAleatorio {
    public int numAleatorio(int numMax) {
        if (numMax < 1){
            return 0;
        }
        Random aleatorio = new Random();
        int resultado = aleatorio.nextInt(numMax) + 1;

        System.out.println("El número aleatorio es: " + resultado);
        return resultado;
    }
    public int numaleatorio_lim (int lim_inf,int lim_sup){
        if (lim_inf<0 || lim_sup<0 || lim_inf > lim_sup){
            System.out.println("Los límites no son correctos");
            return 0;
        }
        Random aleatorio = new Random();
        int resultado = aleatorio.nextInt(lim_sup - lim_inf + 1) + lim_inf;
        System.out.println("EL número aleatorio es:" + resultado);
        return resultado;
    }
}