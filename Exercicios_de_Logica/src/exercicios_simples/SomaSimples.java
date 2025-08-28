package exercicios_simples;
import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de  soma simples!");
        System.out.println("Digite o primeiro número:");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = scanner.nextInt();
        int soma = n1 + n2;
        System.out.printf("A soma de %d e %d é igual a: %d", n1, n2, soma);
        scanner.close();
    }
}
