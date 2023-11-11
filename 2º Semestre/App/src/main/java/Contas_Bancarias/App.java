public class App {

    public static void main(String[] args) {
        ContaBancaria[] contas = new ContaBancaria[10];

        contas[0] = new ContaCorrente();
        contas[0].setSaldo(1100.0);

        contas[1] = new ContaPoupanca();
        contas[1].setSaldo(2100.0);

        contas[2] = new ContaSalario();
        contas[2].setSaldo(3100.0);

        contas[3] = new ContaCorrente();
        contas[3].setSaldo(4100.0);

        contas[4] = new ContaPoupanca();
        contas[4].setSaldo(5100.0);

        contas[5] = new ContaSalario();
        contas[5].setSaldo(6100.0);

        contas[6] = new ContaCorrente();
        contas[6].setSaldo(7100.0);

        contas[7] = new ContaPoupanca();
        contas[7].setSaldo(8100.0);

        contas[8] = new ContaSalario();
        contas[8].setSaldo(9100.0);

        contas[9] = new ContaCorrente();
        contas[9].setSaldo(10100.0);

        double saldoGeral = 0.0;
        double saldoPosPeriodo = 0.0;

        for (ContaBancaria c : contas) {
            saldoGeral += c.getSaldo();
            c.cobrarTaxa();
            c.pagarJuros();
            saldoPosPeriodo += c.getSaldo();
        }
        System.out.println("Saldo Geral = R$ " + saldoGeral);
        System.out.println("Saldo Pos Periodo = R$ " + saldoPosPeriodo);

    }
}
