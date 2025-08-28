package nvl_ll_estruturas_condicinais;

import java.util.Scanner;


public class ClassificacaoDeTriangulos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro lado do triângulo: ");
        double l1 = leitor.nextDouble();
        System.out.print("Digite o valor do segundo lado do triângulo: ");
        double l2 = leitor.nextDouble();
        System.out.print("Digite o valor do terceiro lado do triângulo: ");
        double l3 = leitor.nextDouble();
        
       /* Equilátero: Todos os lados iguais.
        * Isósceles: Dois lados iguais.
        * Escaleno: Todos os lados diferentes.
        */
        if (l1 == l2 && l2 == l3) {
            System.out.println("O triângulo é Equilátero.");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("O triângulo é Isósceles.");
        } else {
            System.out.println("O triângulo é Escaleno.");
            
        }
        leitor.close();
        }
        
    }
    

