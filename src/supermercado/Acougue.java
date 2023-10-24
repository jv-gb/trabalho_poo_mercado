package supermercado;


public class Acougue {
//atributos com tipo e visibilidade especificada
    private boolean temcarneDePorco;
    private boolean temcarneDeFrango;
    private boolean temcarneDeBoi;

    private float precoPorcoKg;
    private float precoFrangoKg;
    private float precoBoiKg;

    private float saldoAcougue;
    private float saldoTotalMercado;

    public Acougue() {
        this.setTemcarneDePorco(true);
        this.setTemcarneDeFrango(true);
        this.setTemcarneDeBoi(true);

        this.setPrecoPorcoKg(12.50f);
        this.setPrecoFrangoKg(10.00f);
        this.setPrecoBoiKg(28.00f);

    }

    public Acougue(boolean p, boolean f, boolean b) {
        this.setTemcarneDePorco(p);
        this.setTemcarneDeFrango(f);
        this.setTemcarneDeBoi(b);

    }

    public Acougue(float p, float f, float b) {
        this.setPrecoPorcoKg(p);
        this.setPrecoFrangoKg(f);
        this.setPrecoBoiKg(b);

    }

    public boolean getTemcarneDePorco() {
        return temcarneDePorco;
    }

    public void setTemcarneDePorco(boolean temcarneDePorco) {
        this.temcarneDePorco = temcarneDePorco;
    }

    public boolean getTemcarneDeFrango() {
        return temcarneDeFrango;
    }

    public void setTemcarneDeFrango(boolean temcarneDeFrango) {
        this.temcarneDeFrango = temcarneDeFrango;
    }

    public boolean getTemcarneDeBoi() {
        return temcarneDeBoi;
    }

    public void setTemcarneDeBoi(boolean temcarneDeBoi) {
        this.temcarneDeBoi = temcarneDeBoi;
    }

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

    public float getSaldoTotalMercado() {
        return saldoTotalMercado;
    }

    public void setSaldoTotalMercado(float saldoTotalMercado) {
        this.saldoTotalMercado = saldoTotalMercado;
    }

}
