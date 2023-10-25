package supermercado;

public class Mercado {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirSaldoDoMercado(int qtdVassouras, int qtdPanelas, int qtdPratos, int qtdBoi, int qtdFrango, int qtdPorco) {
        Acougue acougue = new Acougue();
        UtensiliosDomesticos utensiliosDomesticos = new UtensiliosDomesticos();

        float saldoTotalDoMercado;

        utensiliosDomesticos.comprarVassouras(qtdVassouras);
        utensiliosDomesticos.comprarPanelas(qtdPanelas);
        utensiliosDomesticos.comprarPratos(qtdPratos);

        acougue.comprarBoi(qtdBoi);
        acougue.comprarFrango(qtdFrango);
        acougue.comprarPorco(qtdPorco);

        saldoTotalDoMercado = acougue.getSaldoAcougue() + utensiliosDomesticos.getSaldoDomesticos();

        System.out.print("Saldo do acougue do mercado: ");
        System.out.println(acougue.getSaldoAcougue());

        System.out.print("Saldo da sessao de utensilios domesticos do mercado: ");
        System.out.println(utensiliosDomesticos.getSaldoDomesticos());

        System.out.print("Saldo total do mercado: ");
        System.out.println(saldoTotalDoMercado);

    }

}
