package Cobra.game;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class MainBox {
    public static void main(String[] args) throws MalformedURLException {
        SnakeGame janela = new SnakeGame();
        janela.setSize(500,400);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton Bot1 = new JButton("Iniciar");
        Bot1.setBounds(200,120,115,50);
        janela.add(Bot1);

        JLabel Text1 = new JLabel(" == Snake Game ==");
        Text1.setBounds(200,90,120,20);
        janela.add(Text1);

        JButton Bot2 = new JButton("Settings");
        Bot2.setBounds(140,180,90,50);
        janela.add(Bot2);

        JButton Bot3 = new JButton("Infos");
        Bot3.setBounds(290,180,90,50);
        janela.add(Bot3);

    }
}
