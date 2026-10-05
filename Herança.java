// ==========================================
// EXERCÍCIO 3: VEICULO E CARRO
// ==========================================

// Classe base (superclasse)
class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void buzinar() {
        System.out.println("Bi bi!");
    }
}

// Classe filha (subclasse) que herda de Veiculo
public class Herança extends Veiculo {
    private int quantidadePortas;

    public Herança(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Portas: " + quantidadePortas);
    }
}
