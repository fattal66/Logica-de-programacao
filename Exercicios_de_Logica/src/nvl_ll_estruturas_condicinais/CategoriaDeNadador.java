package nvl_ll_estruturas_condicinais;

import java.util.Scanner;


public class CategoriaDeNadador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);                                   
/* Infantil: até 10 anos
 * Juvenil: 11 a 17 anos
 * Adulto: 18 anos ou mais
 */
        System.out.print("Digite a idade do nadador: ");
        int idade = leitor.nextInt();
        if (idade <= 10) {
            System.out.println("Categoria: Infantil");
        } else if (idade >= 11 && idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else {
            System.out.println("Categoria: Adulto");
            
        }
       
        leitor.close();
        
    }
    
}
