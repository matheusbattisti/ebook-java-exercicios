import java.util.Scanner;

public class SolucoesControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 31: Verificação de Positivo ou Negativo
        System.out.println("Exercício 31:");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        System.out.println();

        // Exercício 32: Par ou Ímpar
        System.out.println("Exercício 32:");
        System.out.print("Digite um número inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero2 % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        System.out.println();

        // Exercício 33: Cálculo de Desconto
        System.out.println("Exercício 33:");
        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra > 100.00) {
            valorCompra *= 0.90;  // Aplicando desconto de 10%
            System.out.println("Desconto aplicado! Valor final: R$ " + valorCompra);
        } else {
            System.out.println("Sem desconto. Valor final: R$ " + valorCompra);
        }
        System.out.println();

        // Exercício 34: Verificação de Maioridade
        System.out.println("Exercício 34:");
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 60) {
            System.out.println("Você é idoso.");
        } else if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        System.out.println();

        // Exercício 35: Classificação de Notas
        System.out.println("Exercício 35:");
        System.out.print("Digite a sua nota (0 a 100): ");
        int nota = scanner.nextInt();

        if (nota >= 60) {
            System.out.println("Você está aprovado.");
        } else {
            System.out.println("Você está reprovado.");
        }
        System.out.println();

        // Exercício 36: Comparação de Três Números
        System.out.println("Exercício 36:");
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos os números são iguais.");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }
        System.out.println();

        // Exercício 37: Avaliação de Temperatura
        System.out.println("Exercício 37:");
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 15) {
            System.out.println("Clima está Frio.");
        } else if (temperatura <= 30) {
            System.out.println("Clima está Agradável.");
        } else {
            System.out.println("Clima está Quente.");
        }
        System.out.println();

        // Exercício 38: Verificação de Nota Escolar
        System.out.println("Exercício 38:");
        System.out.print("Digite sua nota escolar (0 a 10): ");
        double notaEscolar = scanner.nextDouble();

        if (notaEscolar < 5) {
            System.out.println("Classificação: Insuficiente.");
        } else if (notaEscolar <= 7) {
            System.out.println("Classificação: Suficiente.");
        } else {
            System.out.println("Classificação: Bom.");
        }
        System.out.println();

        // Exercício 39: Comparação de Idades
        System.out.println("Exercício 39:");
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        if (idade1 > idade2) {
            System.out.println("A primeira pessoa é mais velha.");
        } else if (idade1 < idade2) {
            System.out.println("A segunda pessoa é mais velha.");
        } else {
            System.out.println("Ambas têm a mesma idade.");
        }
        System.out.println();

        // Exercício 40: Avaliação de Velocidade
        System.out.println("Exercício 40:");
        System.out.print("Digite a velocidade do veículo (km/h): ");
        int velocidade = scanner.nextInt();

        if (velocidade <= 60) {
            System.out.println("Veículo está dentro do limite de velocidade.");
        } else if (velocidade <= 80) {
            System.out.println("Veículo está acima do limite de velocidade.");
        } else {
            System.out.println("Veículo está muito acima do limite de velocidade.");
        }
        System.out.println();
    }
}
