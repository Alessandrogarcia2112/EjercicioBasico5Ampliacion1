import java.util.Scanner;

public class Principal {
    public void main(){
        int numero;
        NumAleatorio numeroAleatorio = new NumAleatorio();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número:" );
        numero = teclado.nextInt();
        numeroAleatorio.numAleatorio(numero);
    }
}
