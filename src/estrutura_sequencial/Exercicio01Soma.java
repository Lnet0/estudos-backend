/*Faça um programa para ler dois valores inteiros,
 *e depois mostrar na tela a soma desses números com uma mensagem explicativa.
 */
package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio01Soma {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num1, num2, soma;

    //Entrada de dados do usuário.
    System.out.print("Digite o primeiro número: ");
    num1 = sc.nextInt();

    System.out.print("Digite o segundo número: ");
    num2 = sc.nextInt();

    //Processamento dos dados informados pelo usuário.
    soma = num1 + num2;

    //Saída de dados com a soma.
    System.out.printf("A soma de %d + %d é igual a %d.%n", num1, num2, soma);

    sc.close();
  }
}
