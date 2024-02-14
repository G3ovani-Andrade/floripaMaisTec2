package bo;

public class Jogador implements Comparable<Jogador> {
    private String Nome;
    private int idade;
    private int pontuacao;
    private int numeroTentivas;
    public Jogador(String nome, int idade, int pontuacao, int numeroTentivas) {
        Nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
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

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuação) {
        this.pontuacao = pontuacao;
    }

    public int getNumeroTentivas() {
        return numeroTentivas;
    }

    public void setNumeroTentivas(int numeroTentivas) {
        this.numeroTentivas = numeroTentivas;
    }
    public void adicionarPontuacao(int pontuacao){
        this.pontuacao += pontuacao;
    }
    public void perderPontuacao(int pontuação){
        this.pontuacao -= pontuacao;
    }
    public void adicionarTentatica(int numeroTentivas){
        this.numeroTentivas += numeroTentivas;
    }


    @Override
    public int compareTo(Jogador o) {
        return  o.getPontuacao() - this.getPontuacao();
    }

    @Override
    public String toString() {
        return Nome;
    }
}
