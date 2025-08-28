package nvl_ll_estruturas_condicinais;
import java.util.Scanner;


public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = leitor.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = leitor.nextDouble();
        System.out.println("Escolha a operação: +, -, *, /");
        char operacao = leitor.next().charAt(0);
        double resultado;
        if (operacao == '+') {
            resultado = n1 + n2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '-') {
            resultado = n1 - n2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '*') {
            resultado = n1 * n2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '/') {
            if (n2 != 0) {
                resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Operação inválida.");
            
        }
        leitor.close();
    }
}