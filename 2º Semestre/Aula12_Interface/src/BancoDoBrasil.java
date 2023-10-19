public class BancoDoBrasil implements SaldoCheque, SaldoBanco {

    @Override
    public String getExtratoCheques() {
        // TODO Auto-generated method stub
        return "EXTRATO DO CHEQUE\nCHEQUE 1, VALOR R$ 5.000,00";
    }

    @Override
    public String getSaldoPorExtenso() {
        // TODO Auto-generated method stub
        return "SALDO CINCO MIL REAIS";
    }

    @Override
    public double getQuantidadeMovimentacao() {
        // TODO Auto-generated method stub
        return 1;
    }

    @Override
    public double getSaldo() {
        // TODO Auto-generated method stub
        return 5000;
    }

    @Override
    public String getExtrato() {
        // TODO Auto-generated method stub
        return "EXTRATO DE R$ 5.000,00 REAIS";
    }

}
