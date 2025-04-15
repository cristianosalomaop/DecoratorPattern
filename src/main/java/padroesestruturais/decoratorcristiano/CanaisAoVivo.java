package padroesestruturais.decoratorcristiano;

public class CanaisAoVivo extends AssinaturaDecorator {

    public CanaisAoVivo(Assinatura assinatura) {

        super(assinatura);
    }

    public float getPercentualPreco() {

        return 20.0f;
    }

    public String getNomeRecurso() {

        return "Canais Ao Vivo";
    }
}
