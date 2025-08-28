package nvl_ll_estruturas_condicinais;
import java.util.Scanner;


public class CalculadoraDeIMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu peso em kg: ");
        double peso = leitor.nextDouble();
        System.out.print("Digite sua altura em metros: ");
        double altura = leitor.nextDouble();
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
            
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está com peso normal.");
            
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com sobrepeso.");
            
        } else {
            System.out.println("Você está com obesidade.");
            
        }
        leitor.close();
    }
    
}
