package exercicios_simples;
import java.util.Scanner;
public class ContadorDeTempo {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao contador de tempo!");
        System.out.println("Digite a quantidade de Dias:");
        int dias = scanner.nextInt();
        int minutos = dias * 24 * 60;
        System.out.printf("A quantidade de minutos em %d dias é: %d%n", dias, minutos);
        scanner.close();

    }
    
}
