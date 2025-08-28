package exercicios_simples;
import java.util.Scanner;
public class PreçoComDesconto {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de preço com desconto!");
        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a porcentagem de desconto:");
        int desconto = scanner.nextInt();
        if (desconto < 0 || desconto > 100) {
            System.out.println("Porcentagem de desconto inválida. Deve estar entre 0 e 100.");
            scanner.close();
            return; 
        }
        double precoFinal = preco - (preco * (desconto / 100));
        System.out.printf("O preço final do produto com desconto de %.2d%% é: R$ %.2f%n", desconto, precoFinal);
        scanner.close();
    }
    
}
