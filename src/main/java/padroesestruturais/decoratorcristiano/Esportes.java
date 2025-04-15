package padroesestruturais.decoratorcristiano;

public class Esportes extends AssinaturaDecorator {

    public Esportes(Assinatura assinatura) {

        super(assinatura);
    }

    public float getPercentualPreco() {

        return 10.0f;
    }

    public String getNomeRecurso() {

        return "Esportes";
    }
}
