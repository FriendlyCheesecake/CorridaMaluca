public class CarroCorrida {

    private Integer numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    public CarroCorrida(Integer numeroCarro, Piloto piloto, float velocidadeMaxima, float velocidadeAtual, boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public boolean ligar() {
        return ligado;
    }

    public float acelerar(float aceleracao) {
        if (!ligado) {
            ligar();
        }
        this.velocidadeAtual += aceleracao;
        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
        System.out.println(this.piloto + " está a " + velocidadeAtual + "Km/h");
        return velocidadeAtual;
    }

    public float frear(float frenagem) {
        if (!ligado) {
            ligar();
        }
        this.velocidadeAtual -= frenagem;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
        System.out.println(this.piloto + " está a " + velocidadeAtual + "Km/h");
        return velocidadeAtual;

    }

    public void parar() {
        boolean parado;
        if (velocidadeAtual == 0) {
            parado = true;
        } else {
            while (velocidadeAtual > 0) {
                --velocidadeAtual;
            }
        }
    }

    public void desligar() {
        boolean desligado = !ligado;
        if (velocidadeAtual == 0) {
            desligado = true;
            System.out.println(this.piloto + " desligou seu carro e abandonou a corrida.");
        } else {
            System.out.println(this.piloto + " tentou desligar o carro em movimento, que doideira! Não pode, tem que parar o carro antes.");
        }

    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Neste instante emocionante da corrida, " +
                "o carro " + numeroCarro +
                ", de " + piloto +
                ", de velocidade máxima " + velocidadeMaxima +
                "Km/h, está a " + velocidadeAtual +
                "Km/h. O carro está ligado? " + ligado;
    }
}
