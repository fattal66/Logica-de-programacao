package nvl_lll_estruturas_de_repeticao;
import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero  positivo:");
        int numero = scanner.nextInt();
        int soma = 0;     
        for (int i = 1; i <= numero; i++) {
            soma += i;
            
        }
        System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);
        scanner.close();
    }
    
}
