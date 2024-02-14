import java.util.*;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Jogador> melhoresJogadores = new ArrayList<>();
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        jogador1.setNome("1");
        jogador1.setPontuacao(10);
        jogador2.setNome("2");
        jogador2.setPontuacao(11);

        melhoresJogadores.add(jogador1);
        melhoresJogadores.add(jogador2);
        Collections.sort(melhoresJogadores);
        gerarRank();
    }
    public static void gerarRank(){
        IntStream.range(0,melhoresJogadores.size())
                .forEach(i-> System.out.println(melhoresJogadores
                                                .get(i).getNome() + melhoresJogadores.get(i).getNome()));
    }
}