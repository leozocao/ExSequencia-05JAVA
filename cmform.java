import java.util.Scanner;

public class cmform {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double Cm, M;

        System.out.print("Digite um valor em metros: ");
        M = teclado.nextDouble();

        Cm = M * 100;

        System.out.printf("O valor %.2fm digitado em centímetros é: %.2fcm", M, Cm);

        teclado.close();
    }
}