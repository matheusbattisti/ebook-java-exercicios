import java.util.ArrayList;

public class SolucoesAtributosMetodosInstancia {

    public static void main(String[] args) {

        // ====================== Exercício 143: Classe Pessoa com Atributos ======================
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";
        pessoa.idade = 25;
        System.out.println("Idade antes do aniversário: " + pessoa.idade);
        pessoa.aniversario();
        System.out.println("Idade após o aniversário: " + pessoa.idade);
        System.out.println();

        // ====================== Exercício 144: Classe Produto com Desconto ======================
        Produto produto1 = new Produto();
        produto1.nome = "Celular";
        produto1.preco = 2000.0;
        produto1.desconto = 10.0;
        System.out.println("Preço original: R$ " + produto1.preco);
        produto1.aplicarDesconto();
        System.out.println("Preço com desconto: R$ " + produto1.preco);
        System.out.println();

        // ====================== Exercício 145: Classe Carro com Consumo ======================
        Carro carro = new Carro();
        carro.marca = "Honda";
        carro.modelo = "Civic";
        carro.consumoCombustivel = 12.0;
        carro.quantidadeCombustivel = 50.0;
        carro.dirigir(100);
        System.out.println("Combustível restante no tanque: " + carro.quantidadeCombustivel + " litros.");
        System.out.println();

        // ====================== Exercício 146: Classe ContaBancaria com Transferência ======================
        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroConta = 12345;
        conta1.saldo = 1000.0;
        ContaBancaria conta2 = new ContaBancaria();
        conta2.numeroConta = 67890;
        conta2.saldo = 500.0;
        System.out.println("Saldo da Conta 1: R$ " + conta1.saldo);
        System.out.println("Saldo da Conta 2: R$ " + conta2.saldo);
        conta1.transferir(conta2, 200.0);
        System.out.println("Saldo da Conta 1 após transferência: R$ " + conta1.saldo);
        System.out.println("Saldo da Conta 2 após transferência: R$ " + conta2.saldo);
        System.out.println();

        // ====================== Exercício 147: Classe Funcionario com Bônus ======================
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Mariana";
        funcionario.salario = 5000.0;
        System.out.println("Salário antes do bônus: R$ " + funcionario.salario);
        funcionario.receberBonus(10);
        System.out.println("Salário após o bônus: R$ " + funcionario.salario);
        System.out.println();

        // ====================== Exercício 148: Classe Aluno com Aprovação ======================
        Aluno aluno = new Aluno();
        aluno.nome = "Lucas";
        aluno.nota1 = 8.0;
        aluno.nota2 = 6.5;
        if (aluno.verificarAprovacao()) {
            System.out.println(aluno.nome + " foi aprovado.");
        } else {
            System.out.println(aluno.nome + " foi reprovado.");
        }
        System.out.println();

        // ====================== Exercício 149: Classe Retângulo com Alteração de Dimensões ======================
        Retangulo retangulo = new Retangulo();
        retangulo.largura = 5.0;
        retangulo.altura = 3.0;
        System.out.println("Área inicial: " + retangulo.calcularArea());
        retangulo.alterarDimensoes(10.0, 8.0);
        System.out.println("Nova área: " + retangulo.calcularArea());
        System.out.println();

        // ====================== Exercício 150: Classe Produto com Aumento de Preço ======================
        Produto produto2 = new Produto();
        produto2.nome = "Geladeira";
        produto2.preco = 1500.0;
        System.out.println("Preço inicial: R$ " + produto2.preco);
        produto2.aumentarPreco(15);
        System.out.println("Preço após aumento: R$ " + produto2.preco);
        System.out.println();

        // ====================== Exercício 151: Classe Pessoa com Altura e Peso ======================
        Pessoa pessoaAlturaPeso = new Pessoa();
        pessoaAlturaPeso.nome = "Joana";
        pessoaAlturaPeso.altura = 1.70;
        pessoaAlturaPeso.peso = 65.0;
        System.out.println("Altura inicial: " + pessoaAlturaPeso.altura + " m");
        System.out.println("Peso inicial: " + pessoaAlturaPeso.peso + " kg");
        pessoaAlturaPeso.alterarPeso(68.0);
        pessoaAlturaPeso.alterarAltura(1.72);
        System.out.println("Nova altura: " + pessoaAlturaPeso.altura + " m");
        System.out.println("Novo peso: " + pessoaAlturaPeso.peso + " kg");
        System.out.println();

        // ====================== Exercício 152: Classe Banco com Saldo Total ======================
        Banco banco = new Banco();
        ContaBancaria contaBanco1 = new ContaBancaria();
        contaBanco1.numeroConta = 12345;
        contaBanco1.saldo = 1000.0;
        ContaBancaria contaBanco2 = new ContaBancaria();
        contaBanco2.numeroConta = 67890;
        contaBanco2.saldo = 2000.0;
        banco.contas.add(contaBanco1);
        banco.contas.add(contaBanco2);
        System.out.println("Saldo total no banco: R$ " + banco.calcularSaldoTotal());
        System.out.println();

        // ====================== Exercício 153: Classe Livro com Empréstimo ======================
        Livro livro = new Livro();
        livro.titulo = "1984";
        livro.autor = "George Orwell";
        livro.disponivel = true;
        livro.emprestar();
        livro.devolver();
        System.out.println();

        // ====================== Exercício 154: Classe Veículo com Abastecimento ======================
        Veiculo veiculo = new Veiculo();
        veiculo.modelo = "SUV";
        veiculo.combustivel = 20.0;
        System.out.println("Combustível inicial: " + veiculo.combustivel + " litros");
        veiculo.abastecer(30);
        System.out.println("Combustível após abastecimento: " + veiculo.combustivel + " litros");
        System.out.println();

        // ====================== Exercício 155: Classe Loja com Produtos ======================
        Loja loja = new Loja();
        loja.nome = "Loja de Eletrônicos";
        Produto produtoLoja1 = new Produto();
        produtoLoja1.nome = "Smartphone";
        produtoLoja1.preco = 1500.0;
        Produto produtoLoja2 = new Produto();
        produtoLoja2.nome = "Televisão";
        produtoLoja2.preco = 3000.0;
        loja.adicionarProduto(produtoLoja1);
        loja.adicionarProduto(produtoLoja2);
        loja.exibirProdutos();
        System.out.println();

        // ====================== Exercício 156: Classe Cesta de Compras com Total ======================
        CestaDeCompras cesta = new CestaDeCompras();
        Produto produtoCesta1 = new Produto();
        produtoCesta1.nome = "Notebook";
        produtoCesta1.preco = 3000.0;
        Produto produtoCesta2 = new Produto();
        produtoCesta2.nome = "Fone de Ouvido";
        produtoCesta2.preco = 200.0;
        cesta.produtos.add(produtoCesta1);
        cesta.produtos.add(produtoCesta2);
        System.out.println("Valor total da cesta: R$ " + cesta.calcularTotal());
        System.out.println();

        // ====================== Exercício 157: Classe Restaurante com Pedidos ======================
        Restaurante restaurante = new Restaurante();
        restaurante.adicionarPedido("Pizza");
        restaurante.adicionarPedido("Lasanha");
        restaurante.adicionarPedido("Hambúrguer");
        restaurante.exibirPedidos();
    }
}

// ====================== Implementação das Classes ======================

// Exercício 143: Classe Pessoa com Atributos
class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;

    public void aniversario() {
        idade++;
    }

    public void alterarPeso(double novoPeso) {
        peso = novoPeso;
    }

    public void alterarAltura(double novaAltura) {
        altura = novaAltura;
    }
}

// Exercício 144: Classe Produto com Desconto
class Produto {
    String nome;
    double preco;
    double desconto;

    public void aplicarDesconto() {
        preco = preco - (preco * (desconto / 100));
    }

    public void aumentarPreco(double porcentagem) {
        preco += preco * (porcentagem / 100);
    }
}

// Exercício 145: Classe Carro com Consumo
class Carro {
    String marca;
    String modelo;
    double consumoCombustivel;
    double quantidadeCombustivel;

    public void dirigir(double distancia) {
        double combustivelNecessario = distancia / consumoCombustivel;
        if (combustivelNecessario <= quantidadeCombustivel) {
            quantidadeCombustivel -= combustivelNecessario;
            System.out.println("Viagem realizada. Combustível restante: " + quantidadeCombustivel + " litros.");
        } else {
            System.out.println("Combustível insuficiente para realizar a viagem.");
        }
    }
}

// Exercício 146: Classe ContaBancaria com Transferência
class ContaBancaria {
    int numeroConta;
    double saldo;

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }
}

// Exercício 147: Classe Funcionario com Bônus
class Funcionario {
    String nome;
    double salario;

    public void receberBonus(double percentual) {
        salario += salario * (percentual / 100);
    }
}

// Exercício 148: Classe Aluno com Aprovação
class Aluno {
    String nome;
    double nota1;
    double nota2;

    public boolean verificarAprovacao() {
        double media = (nota1 + nota2) / 2;
        return media >= 7.0;
    }
}

// Exercício 149: Classe Retângulo com Alteração de Dimensões
class Retangulo {
    double largura;
    double altura;

    public void alterarDimensoes(double novaLargura, double novaAltura) {
        largura = novaLargura;
        altura = novaAltura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}

// Exercício 152: Classe Banco com Saldo Total
class Banco {
    ArrayList<ContaBancaria> contas = new ArrayList<>();

    public double calcularSaldoTotal() {
        double saldoTotal = 0;
        for (ContaBancaria conta : contas) {
            saldoTotal += conta.saldo;
        }
        return saldoTotal;
    }
}

// Exercício 153: Classe Livro com Empréstimo
class Livro {
    String titulo;
    String autor;
    boolean disponivel;

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro foi emprestado.");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("O livro foi devolvido.");
        } else {
            System.out.println("O livro já estava disponível.");
        }
    }
}

// Exercício 154: Classe Veículo com Abastecimento
class Veiculo {
    String modelo;
    double combustivel;

    public void abastecer(double litros) {
        combustivel += litros;
    }
}

// Exercício 155: Classe Loja com Produtos
class Loja {
    String nome;
    ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirProdutos() {
        System.out.println("Produtos da loja " + nome + ":");
        for (Produto produto : produtos) {
            System.out.println(produto.nome + " - R$ " + produto.preco);
        }
    }
}

// Exercício 156: Classe Cesta de Compras com Total
class CestaDeCompras {
    ArrayList<Produto> produtos = new ArrayList<>();

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.preco;
        }
        return total;
    }
}

// Exercício 157: Classe Restaurante com Pedidos
class Restaurante {
    ArrayList<String> pedidos = new ArrayList<>();

    public void adicionarPedido(String pedido) {
        pedidos.add(pedido);
    }

    public void exibirPedidos() {
        System.out.println("Pedidos realizados:");
        for (String pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
