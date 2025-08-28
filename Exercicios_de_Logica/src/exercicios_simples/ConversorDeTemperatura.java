package exercicios_simples;
import java.util.Scanner;
public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao conversor de temperatura!");
        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.1f graus Celsius equivalem a %.1f graus Fahrenheit.%n", celsius, fahrenheit);
        scanner.close();
    }
    
}
