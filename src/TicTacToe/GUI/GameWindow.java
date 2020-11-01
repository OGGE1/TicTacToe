package TicTacToe.GUI;

import TicTacToe.Constants;
import TicTacToe.GameLogic.GameLogic;

import javax.swing.*;
import java.awt.*;

import static TicTacToe.Constants.COLUMNS;
import static TicTacToe.Constants.ROWS;

public class GameWindow extends JFrame {

    private BorderLayout bl = new BorderLayout();
    private GridLayout gl = new GridLayout(3,3);
    private JPanel mainPanel = new JPanel();
    private JPanel gamePanel = new JPanel();
    private JPanel menuPanel = new JPanel();
    private JButton[][] buttons;
    private JButton resetButton = new JButton("Reset");


    public GameWindow() {

        this.gl.setVgap(10);
        this.gl.setHgap(10);
        this.gamePanel.setLayout(gl);
        this.buttons = GameLogic.fillGrid();

        this.menuPanel.add(resetButton);

        
        this.mainPanel.setLayout(bl);
        this.mainPanel.add(gamePanel, BorderLayout.CENTER);
        this.mainPanel.add(menuPanel, BorderLayout.SOUTH);

        updateGUI();

        this.add(mainPanel);
        this.setSize(new Dimension(600, 600));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void updateGUI() {
        this.gamePanel.removeAll();

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                gamePanel.add(buttons[i][j]);
            }
        }
        this.revalidate();
        this.repaint();
    }
}
