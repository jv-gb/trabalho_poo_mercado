package supermercado;

public class UtensiliosDomesticos implements UtensiliosInterface {
//atributos com tipo e visibilidade especificada

    private float precoVassouras;
    private float precoPanelas;
    private float precoPratos;

    private float saldoDomesticos;
//construtores sobrecarregados

    public UtensiliosDomesticos() {

        this.setPrecoVassouras(28.50f);
        this.setPrecoPanelas(90.00f);
        this.setPrecoPratos(10.60f);
        this.setSaldoDomesticos(0.0f);

    }

    public UtensiliosDomesticos(float v, float pa, float pr) {
        this.setPrecoVassouras(v);
        this.setPrecoPanelas(pa);
        this.setPrecoPratos(pr);

    }
    //getters e setters

    public float getPrecoVassouras() {
        return precoVassouras;
    }

    public void setPrecoVassouras(float precoVassouras) {
        this.precoVassouras = precoVassouras;
    }

    public float getPrecoPanelas() {
        return precoPanelas;
    }

    public void setPrecoPanelas(float precoPanelas) {
        this.precoPanelas = precoPanelas;
    }

    public float getPrecoPratos() {
        return precoPratos;
    }

    public void setPrecoPratos(float precoPratos) {
        this.precoPratos = precoPratos;
    }

    public float getSaldoDomesticos() {
        return this.saldoDomesticos;
    }

    public void setSaldoDomesticos(float saldoDomesticos) {
        this.saldoDomesticos = saldoDomesticos;
    }
//implementação dos metodos da interfaces publica UtensiliosInteface

    @Override
    public void comprarVassouras(int quantidade) {

        this.setSaldoDomesticos(this.getSaldoDomesticos() + (this.getPrecoVassouras() * quantidade));

    }

    @Override
    public void comprarPanelas(int quantidade) {

        this.setSaldoDomesticos(this.getSaldoDomesticos() + (this.getPrecoPanelas() * quantidade));

    }

    @Override
    public void comprarPratos(int quantidade) {

        this.setSaldoDomesticos(this.getSaldoDomesticos() + (this.getPrecoPratos() * quantidade));

    }

}
