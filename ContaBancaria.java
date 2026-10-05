//Exercício 2: Aplicando Encapsulamento (ContaBancaria)
//Objetivo: Praticar modificadores de acesso (private), métodos Getters/Setters e validação de dados.
//Descrição: Crie uma classe chamada ContaBancaria com os seguintes atributos privados:
//titular (String)
//saldo (double)
//Instruções:
//Crie o construtor com os dois parâmetros.
//Crie os métodos getter e setter para o atributo titular.
//Crie apenas o getter para o atributo saldo (não deve haver setSaldo).
//Crie os métodos:
//depositar(double valor): adiciona o valor ao saldo se ele for maior que zero.
//sacar(double valor): subtrai o valor do saldo se o valor for positivo e menor ou igual ao saldo disponível. Se o saldo for insuficiente, exiba uma mensagem de erro.


public class ContaBancaria {
    private String titular;
    private double saldo;
public static void main(String[] args) {
        // Instanciando o objeto da classe Livro
        Livro meuLivro = new Livro("Dom Casmurro", "Machado de Assis", 256);

        // Chamando o método para exibir no console
        meuLivro.exibirDetalhes();
    }
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
