//Exercício 1: Criando a Primeira Classe (Livro)
//Objetivo: Praticar criação de classe, definição de atributos, construtor e métodos simples.
//Descrição: Crie uma classe chamada Livro com os seguintes atributos:
//titulo (String)
//autor (String)
//paginas (int)
//Instruções:
//Crie um construtor que receba os três parâmetros para inicializar o objeto.
//Crie um método chamado exibirDetalhes() que imprima no console as informações do livro no formato: "O livro [titulo], escrito por [autor], possui [paginas] páginas."
//Na classe principal (Main), instancie um objeto da classe Livro e chame o método exibirDetalhes().

public class Livro {
    // Atributos
    String titulo;
    String autor;
    int paginas;

    // Construtor
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Método para exibir os detalhes do livro
    public void exibirDetalhes() {
        System.out.println("O livro " + titulo + ", escrito por " + autor + ", possui " + paginas + " páginas.");
    }
}