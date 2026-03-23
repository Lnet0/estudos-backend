/*
 * Exercício 03 - Diferença de Produto
 *
 * Objetivo:
 * Ler quatro valores inteiros A, B, C e D.
 * Calcular e mostrar a diferença do produto de A e B pelo produto de C e D.
 *
 * Fórmula:
 * DIFERENCA = (A * B - C * D)
 */

package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio03DiferencaDeProduto {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Variáveis.
    int a, b, c, d, diferenca;

    //Entrada de dados.
    System.out.println("Digite quatro valores inteiros: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    //Processamento/Cálculo.
    diferenca = (a * b - c * d);

    //Saída de dados
    System.out.printf("DIFERENCA = %d%n", diferenca);

    sc.close();
  }
}
