import java.util.Scanner;

public class SolucoesLacosRepeticao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Exercício 46: Contagem Crescente
        System.out.println("Exercício 46:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        // Exercício 47: Contagem Decrescente
        System.out.println("Exercício 47:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        // Exercício 48: Números Pares
        System.out.println("Exercício 48:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        // Exercício 49: Soma de Números
        System.out.println("Exercício 49:");
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 a 100: " + soma);
        System.out.println();

        // Exercício 50: Tabuada
        System.out.println("Exercício 50:");
        System.out.print("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println();

        // Exercício 51: Fatorial
        System.out.println("Exercício 51:");
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + num + " é: " + fatorial);
        System.out.println();

        // Exercício 52: Números Ímpares
        System.out.println("Exercício 52:");
        for (int i = 1; i <= 50; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        // Exercício 53: Média de Números
        System.out.println("Exercício 53:");
        int somaNumeros = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int valor = scanner.nextInt();
            somaNumeros += valor;
        }
        double media = somaNumeros / 5.0;
        System.out.println("A média é: " + media);
        System.out.println();

        // Exercício 54: Contagem de Multiplos de 3
        System.out.println("Exercício 54:");
        int contagemMultiplos = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                contagemMultiplos++;
            }
        }
        System.out.println("Quantidade de múltiplos de 3 entre 1 e 100: " + contagemMultiplos);
        System.out.println();

        // Exercício 55: Sequência de Fibonacci
        System.out.println("Exercício 55:");
        int termo1 = 0, termo2 = 1;
        System.out.print(termo1 + " " + termo2 + " ");
        for (int i = 3; i <= 10; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");
            termo1 = termo2;
            termo2 = proximoTermo;
        }
        System.out.println();
        System.out.println();

        // Exercício 56: Produto de Números
        System.out.println("Exercício 56:");
        int produto = 1;
        for (int i = 1; i <= 10; i++) {
            produto *= i;
        }
        System.out.println("O produto dos números de 1 a 10 é: " + produto);
        System.out.println();

        // Exercício 57: Soma de Pares e Ímpares Separadamente
        System.out.println("Exercício 57:");
        int somaPares = 0, somaImpares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            } else {
                somaImpares += i;
            }
        }
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
        System.out.println();

        // Exercício 58: Validação de Entrada (while)
        System.out.println("Exercício 58:");
        int numeroValido;
        do {
            System.out.print("Digite um número entre 1 e 10: ");
            numeroValido = scanner.nextInt();
        } while (numeroValido < 1 || numeroValido > 10);
        System.out.println("Número válido: " + numeroValido);
        System.out.println();

        // Exercício 59: Soma de Números (while)
        System.out.println("Exercício 59:");
        int somaAcumulada = 0, valorDigitado;
        do {
            System.out.print("Digite um número (0 para parar): ");
            valorDigitado = scanner.nextInt();
            somaAcumulada += valorDigitado;
        } while (valorDigitado != 0);
        System.out.println("Soma total: " + somaAcumulada);
        System.out.println();

        // Exercício 60: Contagem de Números Positivos (while)
        System.out.println("Exercício 60:");
        int contagemPositivos = 0, numeroPositivo;
        do {
            System.out.print("Digite um número (negativo para parar): ");
            numeroPositivo = scanner.nextInt();
            if (numeroPositivo >= 0) {
                contagemPositivos++;
            }
        } while (numeroPositivo >= 0);
        System.out.println("Quantidade de números positivos: " + contagemPositivos);
        System.out.println();

        // Exercício 61: Raiz Quadrada Aproximada (while)
        System.out.println("Exercício 61:");
        System.out.print("Digite um número inteiro positivo: ");
        int numeroRaiz = scanner.nextInt();
        int raizAprox = 0;
        while (raizAprox * raizAprox < numeroRaiz) {
            raizAprox++;
        }
        System.out.println("Raiz quadrada aproximada de " + numeroRaiz + " é: " + raizAprox);
        System.out.println();

        // Exercício 62: Multiplicação por Acumulação (while)
        System.out.println("Exercício 62:");
        System.out.print("Digite um número: ");
        int valorMultiplicacao = scanner.nextInt();
        while (valorMultiplicacao <= 1000) {
            valorMultiplicacao *= 2;
        }
        System.out.println("Valor final após multiplicação acumulada: " + valorMultiplicacao);
        System.out.println();

        // Exercício 63: Senha Correta (do-while)
        System.out.println("Exercício 63:");
        String senhaCorreta = "1234";
        String senhaDigitada;
        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.next();
        } while (!senhaDigitada.equals(senhaCorreta));
        System.out.println("Senha correta!");
        System.out.println();

        // Exercício 64: Menu de Opções (do-while)
        System.out.println("Exercício 64:");
        int opcao;
        do {
            System.out.println("1. Somar dois números");
            System.out.println("2. Subtrair dois números");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.print("Digite o primeiro número: ");
                int n1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int n2 = scanner.nextInt();
                System.out.println("Soma: " + (n1 + n2));
            } else if (opcao == 2) {
                System.out.print("Digite o primeiro número: ");
                int n1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int n2 = scanner.nextInt();
                System.out.println("Subtração: " + (n1 - n2));
            }
        } while (opcao != 3);
        System.out.println("Programa encerrado.");
        System.out.println();

            
        // Exercício 65: Média de notas
        int totalNotas = 0, numeroNotas = 0, notaAtual;
            
        do {
            System.out.print("Digite uma nota (ou -1 para parar): ");
            notaAtual = scanner.nextInt();
            
            if (notaAtual != -1) {
                totalNotas += notaAtual;
                numeroNotas++;
            }
        } while (notaAtual != -1);
        
        if (numeroNotas > 0) {
            double mediaNotas = totalNotas / (double) numeroNotas;
            System.out.println("Média das notas: " + mediaNotas);
        } else {
            System.out.println("Nenhuma nota foi informada.");
        }

    }

}