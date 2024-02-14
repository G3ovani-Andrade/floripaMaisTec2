import java.util.*;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Jogador> melhoresJogadores = new ArrayList<>();
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        jogador1.setNome("Geovani");
        jogador1.setPontuacao(10);

        jogador2.setNome("Adriano");
        jogador2.setPontuacao(11);

        melhoresJogadores.add(jogador1);
        melhoresJogadores.add(jogador2);


        gerarRank();
    }
    public static void gerarRank(){
        Collections.sort(melhoresJogadores);
        for (int i =0;i<melhoresJogadores.size() && i<=9;i++){
            System.out.println(melhoresJogadores.get(i).toString() + " - posição "+ (i+1));
        }
    }
}