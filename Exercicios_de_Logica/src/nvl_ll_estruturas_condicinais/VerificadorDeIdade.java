package nvl_ll_estruturas_condicinais;

import java.util.Scanner;


public class VerificadorDeIdade {
    public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
     System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        if( idade >= 18) {
            System.out.println("Você é maior de idade pode entrar.");
        } else if (idade >= 16) {
            System.out.println("Você é menor de idade, mas é emancipado? true/false");
            boolean emancipado = leitor.nextBoolean();
            if (emancipado) {
                System.out.println("Você é emancipado pode entrar.");
            } else {
                System.out.println("Você não é emancipado não pode entrar.");
            }
            
        } else {
            System.out.println("Você é menor de idade não pode entrar.");
        }
        leitor.close();
    }
    
}
