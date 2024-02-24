package Cobra.game;
import java.util.Scanner;

public class StatusInicial {
    public static void main(String[] args) {
        System.out.println("===== SNAKE GAME =====");
        System.out.println("Deseja iniciar o jogo? S/N");
        Scanner teclado = new Scanner(System.in);
        String resposta = teclado.next();
        if("S".equals(resposta)){
            System.out.println("Carregando jogo");
        } if ("N".equals(resposta)){
            System.out.println("Fechando o jogo");
        }
    }
}
