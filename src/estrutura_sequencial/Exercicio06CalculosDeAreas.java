/*
 * Exercício 06 - Cálculo de áreas
 *
 * Objetivo:
 * Ler três valores A, B e C e calcular:
 * a) Área do triângulo retângulo (base A, altura C)
 * b) Área do círculo (raio C)
 * c) Área do trapézio (bases A e B, altura C)
 * d) Área do quadrado (lado B)
 * e) Área do retângulo (lados A e B)
 *
 * Fórmulas:
 * TRIANGULO = (A * C) / 2
 * CIRCULO = π * C²
 * TRAPEZIO = (A + B) * C / 2
 * QUADRADO = B²
 * RETANGULO = A * B
 *
 * Exemplo:
 *
 * Entrada:
 * 3.0
 * 4.0
 * 5.2
 *
 * Saída:
 * TRIANGULO: 7.80
 * CIRCULO: 84.94
 * TRAPEZIO: 18.20
 * QUADRADO: 16.00
 * RETANGULO: 12.00
 */
package estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio06CalculosDeAreas {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double a, b, c;
    double triangulo, circulo, trapezio, quadrado, retangulo;
    final double PI = 3.14159;

    //Entrada de dados.
    System.out.print("Digite o primeiro valor: ");
    a = sc.nextDouble();

    System.out.print("Digite o segundo valor: ");
    b = sc.nextDouble();

    System.out.print("Digite o terceiro valor: ");
    c = sc.nextDouble();

    //Processamento/Cálculo.
    triangulo = (a * c) / 2;
    circulo = PI * c * c;
    trapezio = (a + b) * c / 2;
    quadrado = b * b;
    retangulo = a * b;

    //Saída de dados.
    System.out.printf("%nTRIANGULO: %.2f%n", triangulo);
    System.out.printf("CIRCULO: %.2f%n", circulo);
    System.out.printf("TRAPEZIO: %.2f%n", trapezio);
    System.out.printf("QUADRADO: %.2f%n", quadrado);
    System.out.printf("RETANGULO: %.2f%n", retangulo);

    sc.close();
  }
}
