public class Azuki_Bank {
    public static void main(String[] args) {

        Cliente azuki = new Cliente();
        azuki.setNome("Azukito");
        azuki.setSenha("@neroki");

        Conta cc = new ContaCorrente(azuki);
        Conta cp = new ContaPoupanca(azuki);

        cc.depositar(1000.00);
        cc.transferir(100.00,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
