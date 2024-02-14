import bo.Jogador;
import bo.Jogo;

import java.util.*;

public class Main {
    static List<Jogador> melhoresJogadores = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Jogo.jogar();
        jogador1.setNome("Geovani");
        jogador1.setPontuacao(10);

        jogador2.setNome("Adriano");
        jogador2.setPontuacao(11);

        melhoresJogadores.add(jogador1);
        melhoresJogadores.add(jogador2);

        Jogador jogador = criarJogador();
        gerarRank();
        sc.close();
    }
    public static void gerarRank(){
        Collections.sort(melhoresJogadores);
        for (int i =0;i<melhoresJogadores.size() && i<=9;i++){
            System.out.println(melhoresJogadores.get(i).toString() + " - posição "+ (i+1));
        }
    }
    public static boolean checarNome(String novoNome){
         return melhoresJogadores.stream().anyMatch(j->j.getNome().equalsIgnoreCase(novoNome));
    }
    public static Jogador criarJogador() {
        Jogador jogador = new Jogador();
        System.out.println("Insira o nome do novo bo.Jogador: ");
        boolean isNew = true;
        String novoNome;
        do {
            novoNome = sc.nextLine();
            isNew = checarNome(novoNome);
            if (isNew){
                System.out.println("Nome de usuário já existe!");
                System.out.println("Insira um novo nome: ");
            }
        } while (isNew);

        jogador.setNome(novoNome);
        System.out.println(jogador.getNome());
        return jogador;
    }

}