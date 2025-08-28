package exercicios_simples;
import java.util.Scanner;
public class CalculoDaAreaDoCirculo {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao calculador de área do círculo!");
        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A area do circulo com o raio %.2f é: %.2f%n", raio, area);
        scanner.close();
        
    }
        
    }

