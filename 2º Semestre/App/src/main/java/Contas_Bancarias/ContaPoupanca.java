
public class ContaPoupanca extends ContaBancaria {


    @Override
    public void pagarJuros(){
        double novoSaldo = getSaldo() + (getSaldo() * 0.0002);
        setSaldo(novoSaldo);
    }

    @Override
    public void cobrarTaxa(){
        //poupanca nao cobra taxa
    }
}
