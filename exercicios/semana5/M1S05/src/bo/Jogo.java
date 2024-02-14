package bo;

import javax.swing.*;
import java.util.Random;

public class Jogo {
    private static Jogador melhorJogador;
    private static int numeroJogadas;

    public static boolean jogar(){
        numeroJogadas++;
        String[] opcoes = {"Pedra","Papel","Tesoura"};
        int opcao = JOptionPane.showOptionDialog(null,
                                                "Opções",
                                                "Escolha uma opção",
                                                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,
                                                null,
                                                opcoes,
                                                null);
        Random random = new Random();
        int numAleatorio = random.nextInt(2);
        if (opcao>numAleatorio){
            JOptionPane.showMessageDialog(null,"Você ganhou");
        }else {
            JOptionPane.showMessageDialog(null,"Você perdeu");
        }
        return opcao > numAleatorio;
    }
}
