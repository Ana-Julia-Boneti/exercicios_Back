public class bancoMain {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("João Silva", 1000.0);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: " + conta.getSaldo());
        conta.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());
        conta.sacar(200.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());
        conta.sacar(2000.0);
    }
}
