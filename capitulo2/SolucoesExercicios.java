import java.util.Scanner;

public class SolucoesExercicios {

    // Variável global para o exercício 9
    static int variavelGlobal = 10;

    public static void main(String[] args) {

        // Exercício 1: Primeiros Passos
        System.out.println("Exercício 1:");
        System.out.println("Olá, Mundo!");
        System.out.println("Meu nome é Matheus.");
        System.out.println();

        // Exercício 2: Comentários no Código
        System.out.println("Exercício 2:");
        // Este é um comentário de linha, usado para comentar uma única linha

        /*
         * Este é um comentário de bloco,
         * pode ser usado para comentar várias linhas
         */

        /**
         * Este é um comentário de documentação,
         * usado para gerar documentação automática
         * usando ferramentas como o Javadoc
         */
        System.out.println("Comentários adicionados ao código!");
        System.out.println();

        // Exercício 3: Variáveis e Tipos de Dados
        System.out.println("Exercício 3:");
        int idade = 25;
        double altura = 1.75;
        char inicial = 'M';
        boolean estudante = true;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial do nome: " + inicial);
        System.out.println("É estudante? " + estudante);
        System.out.println();

        // Exercício 4: Conversão de Tipos
        System.out.println("Exercício 4:");
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble;  // Conversão explícita de double para int

        int numero = 10;
        double numeroConvertido = numero;  // Conversão implícita de int para double

        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor convertido para int: " + valorInt);
        System.out.println("Número int: " + numero);
        System.out.println("Número convertido para double: " + numeroConvertido);
        System.out.println();

        // Exercício 5: Operações Aritméticas
        System.out.println("Exercício 5:");
        int a = 10;
        int b = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
        System.out.println();

        // Exercício 6: Constantes
        System.out.println("Exercício 6:");
        final double VELOCIDADE_DA_LUZ = 299792458; // em metros por segundo

        System.out.println("Velocidade da luz: " + VELOCIDADE_DA_LUZ + " m/s");
        // VELOCIDADE_DA_LUZ = 300000000; // Esta linha causará um erro de compilação
        System.out.println();

        // Exercício 7: Entrada de Dados
        System.out.println("Exercício 7:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInt = scanner.nextInt();

        System.out.print("Digite um número decimal: ");
        double numeroDouble = scanner.nextDouble();

        double somaNumeros = numeroInt + numeroDouble;
        System.out.println("A soma dos números é: " + somaNumeros);
        System.out.println();

        // Exercício 8: Strings e Concatenação
        System.out.println("Exercício 8:");
        scanner.nextLine();  // Limpar o buffer

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        String mensagem = "Bem-vindo, " + nome + " " + sobrenome + "!";
        System.out.println(mensagem);
        System.out.println();

        // Exercício 9: Tipos de Variáveis
        System.out.println("Exercício 9:");
        int variavelLocal = 5;

        System.out.println("Valor da variável global: " + variavelGlobal);
        System.out.println("Valor da variável local: " + variavelLocal);
        System.out.println();

        // Exercício 10: Formatação de Saída
        System.out.println("Exercício 10:");
        double valor = 123.456789;

        System.out.printf("Valor formatado: %.2f%n", valor);
        System.out.println();
    }
}
