public class Piloto {
    private String nome;
    private Integer idade;
    private Enum Genero;
    private final String equipe;

    public Piloto(String nome, Integer idade, Enum Genero, String equipe) {
        this.nome = nome;
        this.idade = idade;
        this.Genero = Genero;
        this.equipe = equipe;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer setIdade(Integer idade) {
        this.idade = idade;
        return idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public Enum setGenero(Enum Genero) {
        this.Genero = Genero;
        return Genero;
    }

    public Enum getGenero() {
        return Genero;
    }

    public void trocarPiloto(String novoPiloto, Integer novoPilotoIdade, Enum novoGenero) {
        this.setNome(novoPiloto);
        this.setIdade(novoPilotoIdade);
        this.setGenero(novoGenero);

        System.out.println("O piloto da equipe " + this.equipe + " agora é " + getNome() + ".");
    }

    @Override
    public String toString() {
        return nome;
    }
}
