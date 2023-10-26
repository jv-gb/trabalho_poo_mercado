package supermercado;

public class Mercado {

    private String nome;
    private float saldoAcougue;
    private float saldoUtensilios;
    private float saldoTotal;

    public Mercado(String nome, int qtdVassouras, int qtdPanelas, int qtdPratos, int qtdBoi, int qtdFrango, int qtdPorco) {
        //funcao privada que auxilia uma publica
        criarSaldoDoMercado(qtdVassouras, qtdPanelas, qtdPratos, qtdBoi, qtdFrango, qtdPorco);

        this.setNome(nome);
    }
//funcao privada que auxilia uma publica
    private void criarSaldoDoMercado(int qtdVassouras, int qtdPanelas, int qtdPratos, int qtdBoi, int qtdFrango, int qtdPorco) {
        Acougue acougue = new Acougue();
        UtensiliosDomesticos utensiliosDomesticos = new UtensiliosDomesticos();

        
//esses metodos são chamados no construtor Mercado que é chamado na classe principal onde é preenchido
        utensiliosDomesticos.comprarVassouras(qtdVassouras);
        utensiliosDomesticos.comprarPanelas(qtdPanelas);
        utensiliosDomesticos.comprarPratos(qtdPratos);

        acougue.comprarBoi(qtdBoi);
        acougue.comprarFrango(qtdFrango);
        acougue.comprarPorco(qtdPorco);

       

        this.setSaldoAcougue(acougue.getSaldoAcougue());
        this.setSaldoUtensilios(utensiliosDomesticos.getSaldoDomesticos());
        this.setSaldoTotal(acougue.getSaldoAcougue() + utensiliosDomesticos.getSaldoDomesticos());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldoAcougue() {
        return saldoAcougue;
    }

    public void setSaldoAcougue(float saldoAcougue) {
        this.saldoAcougue = saldoAcougue;
    }

    public float getSaldoUtensilios() {
        return saldoUtensilios;
    }

    public void setSaldoUtensilios(float saldoUtensilios) {
        this.saldoUtensilios = saldoUtensilios;
    }

    public float getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(float saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

}
