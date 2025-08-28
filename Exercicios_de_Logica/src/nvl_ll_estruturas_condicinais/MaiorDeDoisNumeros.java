package nvl_ll_estruturas_condicinais;

import java.util.Scanner;


public class MaiorDeDoisNumeros {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1 = Scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = Scanner.nextInt();
        if(n1 > n2){
            System.out.println("O maior número é: " + n1);
        } else if(n2 > n1) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }
        Scanner.close();
    }
    
}
