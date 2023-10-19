public class App {
    public static void main(String[] args) throws Exception {

        BancoDoBrasil bb = new BancoDoBrasil();
        System.out.println(bb.getExtrato());
        System.out.println(bb.getExtratoCheques());
        System.out.println(bb.getQuantidadeMovimentacao());
        System.out.println(String.valueOf(bb.getSaldo()));
        System.out.println(bb.getSaldoPorExtenso());

        BancoNuBanck bn = new BancoNuBanck();
        System.out.println(bn.getExtrato());
        System.out.println(bn.getQuantidadeMovimentacao());
        System.out.println(String.valueOf(bn.getSaldo()));
        System.out.println(bn.getSaldoDigital());

    }
}
