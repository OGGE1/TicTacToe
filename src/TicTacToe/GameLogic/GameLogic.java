package TicTacToe.GameLogic;
import TicTacToe.Constants;
import TicTacToe.GUI.GameWindow;

import javax.swing.*;

public abstract class GameLogic {

    public static JButton[][] fillGrid() {
        JButton[][] out = new JButton[Constants.ROWS][Constants.COLUMNS];
        for (int i = 0; i < Constants.ROWS; i++) {
            for (int j = 0; j < Constants.COLUMNS; j++) {
                out[i][j] = new JButton();
            }
        }
        return out;
    }

}
