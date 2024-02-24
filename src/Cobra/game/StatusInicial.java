package Cobra.game;
import java.util.Scanner;

public class StatusInicial {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner teclado = new Scanner(System.in);
        String resposta = teclado.next();
        if("S".equals(resposta)){
            System.out.println("Carregando jogo");
        } else
            System.out.println("Fechando");
    }

}
