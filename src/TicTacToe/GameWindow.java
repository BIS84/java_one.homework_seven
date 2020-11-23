package TicTacToe;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private static final int WIN_WIDTH = 507;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;

    GameWindow() {
        setLocation(WIN_POSX, WIN_POSY);
        setSize(WIN_WIDTH, WIN_HEIGHT);

        setVisible(true);

        setTitle("Tic Tac Toe");
        setResizable(false);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton btnStart = new JButton("Start");
        JButton btnExit = new JButton("Exit");
        JPanel panelButtons = new JPanel(new GridLayout(1, 2));

        panelButtons.add(btnStart);
        panelButtons.add(btnExit);
        add(panelButtons, BorderLayout.SOUTH);

    }

}


