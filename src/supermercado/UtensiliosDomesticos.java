package supermercado;

public class UtensiliosDomesticos {
//atributos com tipo e visibilidade especificada

    private boolean temVassouras;
    private boolean temPanelas;
    private boolean temPratos;
    private float precoVassouras;
    private float precoPanelas;
    private float precoPratos;

    private float saldoDomesticos;
    private float saldoTotalMercado;

    public UtensiliosDomesticos() {
        this.setTemVassouras(true);
        this.setTemPanelas(true);
        this.setTemPratos(true);

        this.setPrecoVassouras(28.50f);
        this.setPrecoPanelas(90.00f);
        this.setPrecoPratos(10.60f);

    }

    public UtensiliosDomesticos(boolean v, boolean pa, boolean pr) {
        this.setTemVassouras(v);
        this.setTemPanelas(pa);
        this.setTemPratos(pr);

    }

    public UtensiliosDomesticos(float v, float pa, float pr) {
        this.setPrecoVassouras(v);
        this.setPrecoPanelas(pa);
        this.setPrecoPratos(pr);

    }

    public boolean getTemVassouras() {
        return temVassouras;
    }

    public void setTemVassouras(boolean temVassouras) {
        this.temVassouras = temVassouras;
    }

    public boolean getTemPanelas() {
        return temPanelas;
    }

    public void setTemPanelas(boolean temPanelas) {
        this.temPanelas = temPanelas;
    }

    public boolean getTemPratos() {
        return temPratos;
    }

    public void setTemPratos(boolean temPratos) {
        this.temPratos = temPratos;
    }

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
        return saldoDomesticos;
    }

    public void setSaldoDomesticos(float saldoDomesticos) {
        this.saldoDomesticos = saldoDomesticos;
    }

    public float getSaldoTotalMercado() {
        return saldoTotalMercado;
    }

    public void setSaldoTotalMercado(float saldoTotalMercado) {
        this.saldoTotalMercado = saldoTotalMercado;
    }

}
