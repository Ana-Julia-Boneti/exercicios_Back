public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 6000.0, "Tecnologia");
        
        gerente.gerenciar();
        System.out.println("Salário inicial: R$ " + gerente.getSalario());
        
        gerente.aumentarSalario(15.0);
        System.out.println("Salário após aumento: R$ " + gerente.getSalario());
    }
}