public class MainHerança {
    public static void main(String[] args) {
        // --- Teste do Exercício 3 (Veiculo / Carro) ---
        System.out.println("--- EXERCÍCIO 3 ---");
        Herança meuCarro = new Herança("Toyota", "Corolla", 4);
        meuCarro.buzinar();
        meuCarro.exibirInfo();
    }
}