package supermercado;

public class Acougue implements AcougueInterface {
//atributos com tipo e visibilidade especificada

    private float precoBoiKg;
    private float precoFrangoKg;
    private float precoPorcoKg;

    private float saldoAcougue;
//construtores sobrecarregados

    public Acougue() {

        this.setPrecoPorcoKg(12.50f);
        this.setPrecoFrangoKg(10.00f);
        this.setPrecoBoiKg(28.00f);

    }

    public Acougue(float p, float f, float b) {
        this.setPrecoPorcoKg(p);
        this.setPrecoFrangoKg(f);
        this.setPrecoBoiKg(b);

    }
//getters e setters

    public float getPrecoPorco() {
        return precoPorcoKg;
    }

    public void setPrecoPorcoKg(float precoPorco) {
        this.precoPorcoKg = precoPorco;
    }

    public float getPrecoFrango() {
        return precoFrangoKg;
    }

    public void setPrecoFrangoKg(float precoFrango) {
        this.precoFrangoKg = precoFrango;
    }

    public float getPrecoBoi() {
        return precoBoiKg;
    }

    public void setPrecoBoiKg(float precoBoi) {
        this.precoBoiKg = precoBoi;
    }

    public float getSaldoAcougue() {
        return saldoAcougue;
    }

    public void setSaldoAcougue(float saldoAcougue) {
        this.saldoAcougue = saldoAcougue;
    }
//implementação dos metodos da interfaces publica AcougueInterface

    @Override
    public void comprarBoi(int quantidade) {

        this.setSaldoAcougue(getSaldoAcougue() + (this.getPrecoBoi() * quantidade));

    }

    @Override
    public void comprarFrango(int quantidade) {

        this.setSaldoAcougue(getSaldoAcougue() + (this.getPrecoFrango() * quantidade));

    }

    @Override
    public void comprarPorco(int quantidade) {

        this.setSaldoAcougue(getSaldoAcougue() + (this.getPrecoPorco() * quantidade));

    }

}
