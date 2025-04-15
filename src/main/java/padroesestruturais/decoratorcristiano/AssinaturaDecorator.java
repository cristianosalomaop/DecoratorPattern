package padroesestruturais.decoratorcristiano;

public abstract class AssinaturaDecorator implements Assinatura {

    private Assinatura assinatura;
    public String recursos;

    public AssinaturaDecorator(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    public Assinatura getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.assinatura.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeRecurso();

    public String getRecursos() {
        return this.assinatura.getRecursos() + "/" + this.getNomeRecurso();
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }
}
