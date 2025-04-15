package padroesestruturais.decoratorcristiano;

public class Filmes extends AssinaturaDecorator {

    public Filmes(Assinatura assinatura) {

        super(assinatura);
    }

    public float getPercentualPreco() {

        return 15.0f;
    }

    public String getNomeRecurso() {

        return "Filmes";
    }
}
