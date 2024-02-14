import java.util.Comparator;

public class Jogador implements Comparable<Jogador> {
    private String Nome;
    private int idade;
    private int pontuacao;
    private int numeroTentivas;
    public Jogador(String nome, int idade, int pontuação, int numeroTentivas) {
        Nome = nome;
        this.idade = idade;
        this.pontuacao = pontuação;
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
        this.pontuacao = pontuação;
    }

    public int getNumeroTentivas() {
        return numeroTentivas;
    }

    public void setNumeroTentivas(int numeroTentivas) {
        this.numeroTentivas = numeroTentivas;
    }
    public void adicionarPontuacao(int pontuação){
        this.pontuacao += pontuação;
    }
    public void perderPontuacao(int pontuação){
        this.pontuacao -= pontuação;
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
