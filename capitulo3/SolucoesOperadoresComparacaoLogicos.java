import java.util.Scanner;

public class SolucoesOperadoresComparacaoLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 16: Comparação Simples
        System.out.println("Exercício 1:");
        System.out.print("Digite o primeiro número inteiro: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (valor1 < valor2) {
            System.out.println("O primeiro número é menor que o segundo.");
        } else {
            System.out.println("Os dois números são iguais.");
        }
        System.out.println();

        // Exercício 17: Verificação de Paridade
        System.out.println("Exercício 2:");
        System.out.print("Digite um número inteiro: ");
        int valor3 = scanner.nextInt();

        if (valor3 % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        System.out.println();

        // Exercício 18: Maior de Três Números
        System.out.println("Exercício 3:");
        System.out.print("Digite o primeiro número inteiro: ");
        int valor4 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int valor5 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int valor6 = scanner.nextInt();

        int maior = valor4;

        if (valor5 > maior) {
            maior = valor5;
        }

        if (valor6 > maior) {
            maior = valor6;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println();

        // Exercício 19: Elegibilidade para Votação
        System.out.println("Exercício 4:");
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é elegível para votar.");
        } else {
            System.out.println("Você não é elegível para votar.");
        }
        System.out.println();

        // Exercício 20: Verificação de Intervalo
        System.out.println("Exercício 5:");
        System.out.print("Digite um número inteiro: ");
        int valor7 = scanner.nextInt();

        if (valor7 >= 10 && valor7 <= 20) {
            System.out.println("O número está dentro do intervalo.");
        } else {
            System.out.println("O número está fora do intervalo.");
        }
        System.out.println();

        // Exercício 21: Comparação de Strings
        System.out.println("Exercício 6:");
        scanner.nextLine();  // Limpar o buffer do scanner
        System.out.print("Digite a primeira string: ");
        String string1 = scanner.nextLine();

        System.out.print("Digite a segunda string: ");
        String string2 = scanner.nextLine();

        if (string1.equals(string2)) {
            System.out.println("As strings são iguais.");
        } else {
            System.out.println("As strings são diferentes.");
        }
        System.out.println();

        // Exercício 22: Operadores Lógicos AND e OR
        System.out.println("Exercício 7:");
        System.out.print("Digite o primeiro número inteiro: ");
        int valor8 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int valor9 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int valor10 = scanner.nextInt();

        if (valor8 > 10 || valor9 > 10 || valor10 > 10) {
            System.out.println("Pelo menos um dos números é maior que 10.");
        } else {
            System.out.println("Nenhum dos números é maior que 10.");
        }

        if (valor8 > 10 && valor9 > 10 && valor10 > 10) {
            System.out.println("Todos os números são maiores que 10.");
        } else {
            System.out.println("Nem todos os números são maiores que 10.");
        }
        System.out.println();

        // Exercício 23: Verificação de Maioria
        System.out.println("Exercício 8:");
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        System.out.print("Digite a idade da terceira pessoa: ");
        int idade3 = scanner.nextInt();

        int maioridade = 0;

        if (idade1 >= 18) maioridade++;
        if (idade2 >= 18) maioridade++;
        if (idade3 >= 18) maioridade++;

        if (maioridade >= 2) {
            System.out.println("Pelo menos duas pessoas são maiores de idade.");
        } else {
            System.out.println("Menos de duas pessoas são maiores de idade.");
        }
        System.out.println();

        // Exercício 24: Ano Bissexto
        System.out.println("Exercício 9:");
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }
        System.out.println();

        // Exercício 25: Verificação de Números Positivos
        System.out.println("Exercício 10:");
        System.out.print("Digite o primeiro número inteiro: ");
        int valor11 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int valor12 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int valor13 = scanner.nextInt();

        int positivos = 0;

        if (valor11 > 0) positivos++;
        if (valor12 > 0) positivos++;
        if (valor13 > 0) positivos++;

        if (positivos >= 2) {
            System.out.println("Pelo menos dois dos números são positivos.");
        } else {
            System.out.println("Menos de dois dos números são positivos.");
        }
        System.out.println();
    }
}
