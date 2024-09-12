import java.util.Scanner;

public class SolucoesOperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 11: Calculadora Simples
        System.out.println("Exercício 11:");
        System.out.print("Digite o primeiro número inteiro: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int valor2 = scanner.nextInt();

        int soma = valor1 + valor2;
        int subtracao = valor1 - valor2;
        int multiplicacao = valor1 * valor2;
        int divisao = valor1 / valor2;
        int modulo = valor1 % valor2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
        System.out.println();

        // Exercício 12: Média Aritmética
        System.out.println("Exercício 12:");
        System.out.print("Digite o primeiro número inteiro: ");
        int valor3 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int valor4 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int valor5 = scanner.nextInt();

        double media = (valor3 + valor4 + valor5) / 3.0;

        System.out.println("A média aritmética é: " + media);
        System.out.println();

        // Exercício 13: Área de um Retângulo
        System.out.println("Exercício 13:");
        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = largura * altura;

        System.out.println("A área do retângulo é: " + area);
        System.out.println();

        // Exercício 14: Conversão de Temperatura
        System.out.println("Exercício 14:");
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        System.out.println();

        // Exercício 15: Potenciação
        System.out.println("Exercício 15:");
        System.out.print("Digite o número base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        double resultado = Math.pow(base, expoente);

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
        System.out.println();
    }
}
