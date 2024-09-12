import java.util.Scanner;

public class SolucoesSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 41: Dia da Semana
        System.out.println("Exercício 41:");
        System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
        int diaSemana = scanner.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido! Digite um número de 1 a 7.");
        }
        System.out.println();

        // Exercício 42: Classificação de Nota
        System.out.println("Exercício 42:");
        System.out.print("Digite uma nota de 0 a 10: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 10:
                System.out.println("Excelente");
                break;
            case 9:
            case 8:
                System.out.println("Muito bom");
                break;
            case 7:
            case 6:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Regular");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Nota inválida.");
        }
        System.out.println();

        // Exercício 43: Operações Matemáticas
        System.out.println("Exercício 43:");
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case '-':
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case '*':
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case '/':
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }
        System.out.println();

        // Exercício 44: Estação do Ano
        System.out.println("Exercício 44:");
        System.out.print("Digite um número de 1 a 4 para a estação do ano: ");
        int estacao = scanner.nextInt();

        switch (estacao) {
            case 1:
                System.out.println("Verão");
                break;
            case 2:
                System.out.println("Outono");
                break;
            case 3:
                System.out.println("Inverno");
                break;
            case 4:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Número inválido. Digite um número de 1 a 4.");
        }
        System.out.println();

        // Exercício 45: Classificação de Idade
        System.out.println("Exercício 45:");
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        switch (idade) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Criança");
                break;
            case 13, 14, 15, 16, 17:
                System.out.println("Adolescente");
                break;
            case 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59:
                System.out.println("Adulto");
                break;
            default:
                System.out.println("Idoso");
        }
        System.out.println();
    }
}
