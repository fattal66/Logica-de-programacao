package nvl_ll_estruturas_condicinais;
import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        double n2 = scanner.nextDouble();
        double notaFinal = (n1 + n2) / 2;
        if (notaFinal >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        scanner.close();
       
    }
    
}
