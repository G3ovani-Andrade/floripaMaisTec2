public class Jogador {
    private String Nome;
    private int idade;
    private int pontuação;
    private int numeroTentivas;
    public Jogador(String nome, int idade, int pontuação, int numeroTentivas) {
        Nome = nome;
        this.idade = idade;
        this.pontuação = pontuação;
        this.numeroTentivas = numeroTentivas;
    }

    public Jogador() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPontuação() {
        return pontuação;
    }

    public void setPontuação(int pontuação) {
        this.pontuação = pontuação;
    }

    public int getNumeroTentivas() {
        return numeroTentivas;
    }

    public void setNumeroTentivas(int numeroTentivas) {
        this.numeroTentivas = numeroTentivas;
    }
    public void adicionarPontuacao(int pontuação){
        this.pontuação += pontuação;
    }
    public void perderPontuacao(int pontuação){
        this.pontuação -= pontuação;
    }
    public void adicionarTentatica(int numeroTentivas){
        this.numeroTentivas += numeroTentivas;
    }

}
