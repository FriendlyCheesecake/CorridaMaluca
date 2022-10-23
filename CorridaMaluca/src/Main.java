

public class Main {
    public static void main(String[] args) {
        Piloto penelopeCharmosa = new Piloto("Penelope Charmosa", 26, Genero.FEMININO, "Charmosa");
        Piloto dickVigarista = new Piloto("Dick Vigarista", 43, Genero.MASCULINO, "Malvada");
        Piloto peterPerfeito = new Piloto("Peter Perfeito", 23, Genero.MASCULINO, "Perfeita");
        Piloto duplaSinistra = new Piloto("Medonho", 18, Genero.NAOBINARIO, "Dupla Sinistra");

        CarroCorrida maquinaDoMal = new CarroCorrida(0, dickVigarista, 204, 80, true);
        CarroCorrida carrinhoPraFrente = new CarroCorrida(5, penelopeCharmosa, 235, 118, true);
        CarroCorrida carraoAerodinamico = new CarroCorrida(9, peterPerfeito, 206, 0, false);
        CarroCorrida cupeMalAssombrado = new CarroCorrida(2, duplaSinistra, 220, 0, false);

        maquinaDoMal.acelerar(20);

        duplaSinistra.trocarPiloto("Medinho", 32, Genero.MASCULINO);

        carraoAerodinamico.acelerar(40);

        cupeMalAssombrado.ligar();

        cupeMalAssombrado.acelerar(80);

        System.out.println(cupeMalAssombrado);

        maquinaDoMal.desligar();

        carraoAerodinamico.frear(60);

        carrinhoPraFrente.frear(12);

        System.out.println(carrinhoPraFrente);

        carraoAerodinamico.desligar();

        maquinaDoMal.parar();

        System.out.println(maquinaDoMal);

    }

}
