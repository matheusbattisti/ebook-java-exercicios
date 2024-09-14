public class ExerciciosDefinicaoDeClasses {

    public static void main(String[] args) {

        // ====================== Exercício 1: Definindo uma Classe Simples ======================
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2020;
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);
        System.out.println();

        // ====================== Exercício 2: Definindo Atributos e Métodos ======================
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Carlos";
        pessoa1.idade = 30;
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Ana";
        pessoa2.idade = 25;
        pessoa1.apresentar();
        pessoa2.apresentar();
        System.out.println();

        // ====================== Exercício 3: Definindo uma Classe com Construtor ======================
        ContaBancaria minhaConta = new ContaBancaria(12345, 500.0);
        System.out.println("Número da conta: " + minhaConta.numeroConta);
        System.out.println("Saldo inicial: " + minhaConta.saldo);
        System.out.println();

        // ====================== Exercício 4: Métodos para Manipular Dados ======================
        minhaConta.depositar(200.0);
        System.out.println("Saldo após depósito: " + minhaConta.saldo);
        minhaConta.sacar(100.0);
        System.out.println("Saldo após saque: " + minhaConta.saldo);
        System.out.println();

        // ====================== Exercício 5: Classe Produto ======================
        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3000.0;
        produto1.quantidade = 10;
        Produto produto2 = new Produto();
        produto2.nome = "Mouse";
        produto2.preco = 50.0;
        produto2.quantidade = 100;
        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
        System.out.println();

        // ====================== Exercício 6: Relacionamento entre Classes ======================
        Turma turma1 = new Turma();
        turma1.nome = "3A";
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.turma = turma1;
        aluno1.exibirDados();
        System.out.println();

        // ====================== Exercício 7: Classe Retângulo ======================
        Retangulo retangulo = new Retangulo();
        retangulo.largura = 5.0;
        retangulo.altura = 3.0;
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        System.out.println();

        // ====================== Exercício 8: Definindo Métodos com Retorno ======================
        Cilindro cilindro = new Cilindro();
        cilindro.raio = 3.0;
        cilindro.altura = 10.0;
        System.out.println("Volume do cilindro: " + cilindro.calcularVolume());
        System.out.println();

        // ====================== Exercício 9: Classe Aluno com Média ======================
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Carlos";
        aluno2.nota1 = 8.0;
        aluno2.nota2 = 9.5;
        System.out.println("Média do aluno " + aluno2.nome + ": " + aluno2.calcularMedia());
        System.out.println();

        // ====================== Exercício 10: Classe com Métodos Estáticos ======================
        System.out.println("Soma: " + Calculadora.somar(10, 5));
        System.out.println("Subtração: " + Calculadora.subtrair(10, 5));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(10, 5));
        System.out.println("Divisão: " + Calculadora.dividir(10, 5));
        System.out.println();

        // ====================== Exercício 11: Classe Livro ======================
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Quixote";
        livro1.autor = "Miguel de Cervantes";
        livro1.numeroPaginas = 992;
        Livro livro2 = new Livro();
        livro2.titulo = "1984";
        livro2.autor = "George Orwell";
        livro2.numeroPaginas = 328;
        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
        System.out.println();

        // ====================== Exercício 12: Classe Funcionario ======================
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.salario = 3000.0;
        funcionario.cargo = "Analista de Sistemas";
        funcionario.aumentarSalario(10);
        funcionario.exibirDetalhes();
        System.out.println();

        // ====================== Exercício 13: Classe Fatura ======================
        Fatura fatura = new Fatura();
        fatura.numeroItem = "001";
        fatura.descricao = "Notebook";
        fatura.quantidade = 2;
        fatura.precoPorItem = 2500.0;
        double totalFatura = fatura.calcularTotal();
        System.out.println("Valor total da fatura: R$ " + totalFatura);
        System.out.println();

        // ====================== Exercício 14: Classe ContaCorrente ======================
        ContaCorrente conta = new ContaCorrente();
        conta.numeroConta = 123456;
        conta.saldo = 2000.0;
        conta.limite = 3000.0;
        conta.verificarLimite();
        System.out.println();

        // ====================== Exercício 15: Classe Filme ======================
        Filme filme1 = new Filme();
        filme1.titulo = "O Poderoso Chefão";
        filme1.diretor = "Francis Ford Coppola";
        filme1.duracao = 175;
        Filme filme2 = new Filme();
        filme2.titulo = "Pulp Fiction";
        filme2.diretor = "Quentin Tarantino";
        filme2.duracao = 154;
        filme1.exibirInformacoes();
        filme2.exibirInformacoes();
    }
}

// ====================== Implementação das Classes ======================

// Exercício 1: Classe Carro
class Carro {
    String marca;
    String modelo;
    int ano;
}

// Exercício 2: Classe Pessoa
class Pessoa {
    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

// Exercício 3 e 4: Classe ContaBancaria
class ContaBancaria {
    int numeroConta;
    double saldo;

    public ContaBancaria(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

// Exercício 5: Classe Produto
class Produto {
    String nome;
    double preco;
    int quantidade;

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor total em estoque: R$ " + calcularValorEstoque());
    }
}

// Exercício 6: Classes Aluno e Turma
class Turma {
    String nome;

    public void exibirTurma() {
        System.out.println("Turma: " + nome);
    }
}

class Aluno {
    String nome;
    Turma turma;

    public void exibirDados() {
        System.out.println("Aluno: " + nome);
        turma.exibirTurma();
    }
}

// Exercício 7: Classe Retangulo
class Retangulo {
    double largura;
    double altura;

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

// Exercício 8: Classe Cilindro
class Cilindro {
    double raio;
    double altura;

    public double calcularVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
}

// Exercício 9: Classe Aluno com Média
class AlunoMedia {
    String nome;
    double nota1;
    double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}

// Exercício 10: Classe Calculadora com Métodos Estáticos
class Calculadora {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return 0;
        }
    }
}

// Exercício 11: Classe Livro
class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}

// Exercício 12: Classe Funcionario
class Funcionario {
    String nome;
    double salario;
    String cargo;

    public void aumentarSalario(double porcentagem) {
        salario += salario * (porcentagem / 100);
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    }
}

// Exercício 13: Classe Fatura
class Fatura {
    String numeroItem;
    String descricao;
    int quantidade;
    double precoPorItem;

    public double calcularTotal() {
        return quantidade * precoPorItem;
    }
}

// Exercício 14: Classe ContaCorrente
class ContaCorrente {
    int numeroConta;
    double saldo;
    double limite;

    public void verificarLimite() {
        if (saldo > limite) {
            System.out.println("Saldo acima do limite.");
        } else {
            System.out.println("Saldo dentro do limite.");
        }
    }
}

// Exercício 15: Classe Filme
class Filme {
    String titulo;
    String diretor;
    int duracao; // duração em minutos

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracao + " minutos");
    }
}
