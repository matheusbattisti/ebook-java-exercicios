import java.util.Scanner;

public class SolucoesOperadoresAtribuicaoIncremento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 26: Atribuição Simples
        System.out.println("Exercício 26:");
        int valor = 10;

        valor += 5;
        System.out.println("Após valor += 5: " + valor);

        valor -= 3;
        System.out.println("Após valor -= 3: " + valor);

        valor *= 2;
        System.out.println("Após valor *= 2: " + valor);

        valor /= 4;
        System.out.println("Após valor /= 4: " + valor);

        valor %= 3;
        System.out.println("Após valor %= 3: " + valor);
        System.out.println();

        // Exercício 27: Incremento e Decremento
        System.out.println("Exercício 27:");
        int numero = 15;

        System.out.println("Valor inicial: " + numero);

        numero++;
        System.out.println("Após incremento (++numero): " + numero);

        numero--;
        System.out.println("Após decremento (--numero): " + numero);
        System.out.println();

        // Exercício 28: Soma Acumulada
        System.out.println("Exercício 28:");
        int somaAcumulada = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int valorDigitado = scanner.nextInt();
            somaAcumulada += valorDigitado;
        }

        System.out.println("Soma acumulada: " + somaAcumulada);
        System.out.println();

        // Exercício 29: Pré-incremento e Pós-incremento
        System.out.println("Exercício 29:");
        int valorPrePos = 10;

        System.out.println("Valor inicial: " + valorPrePos);

        int preIncremento = ++valorPrePos;
        System.out.println("Após pré-incremento (++valor): " + preIncremento);

        int posIncremento = valorPrePos++;
        System.out.println("Após pós-incremento (valor++): " + posIncremento);

        System.out.println("Valor final após pós-incremento: " + valorPrePos);
        System.out.println();

        // Exercício 30: Operadores Compostos
        System.out.println("Exercício 30:");
        System.out.print("Digite o primeiro número inteiro: ");
        int valor6 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int valor7 = scanner.nextInt();

        valor6 += valor7;
        System.out.println("Após valor6 += valor7: " + valor6);

        valor6 -= valor7;
        System.out.println("Após valor6 -= valor7: " + valor6);

        valor6 *= valor7;
        System.out.println("Após valor6 *= valor7: " + valor6);

        valor6 /= valor7;
        System.out.println("Após valor6 /= valor7: " + valor6);

        valor6 %= valor7;
        System.out.println("Após valor6 %= valor7: " + valor6);
        System.out.println();
    }
}
