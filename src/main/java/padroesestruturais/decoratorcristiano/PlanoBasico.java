package padroesestruturais.decoratorcristiano;

public class PlanoBasico implements Assinatura {

    private float preco;

    public PlanoBasico() {
    }

    public PlanoBasico(float preco) {

        this.preco = preco;
    }

    public float getPreco() {

        return preco;
    }

    public String getRecursos() {

        return "Plano Básico";
    }
}
