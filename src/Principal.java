import java.util.Scanner;

public class Principal {
    public void main(){
        int inf;
        int sup;
        NumAleatorio numeroAleatorio = new NumAleatorio();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número como límite inferior:" );
        inf = teclado.nextInt();
        System.out.println("Ingresa un número como límite superior:" );
        sup = teclado.nextInt();
        numeroAleatorio.numaleatorio_lim(inf,sup);
    }
}
