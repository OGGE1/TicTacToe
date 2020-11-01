package TicTacToe.GameLogic;
import TicTacToe.Constants;
import TicTacToe.GUI.GameWindow;

import javax.swing.*;

import static TicTacToe.Constants.*;

public abstract class GameLogic {

    public static JButton[][] fillGrid() {
        JButton[][] out = new JButton[ROWS][Constants.COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < Constants.COLUMNS; j++) {
                out[i][j] = new JButton();
            }
        }
        return out;
    }

    //TODO
    public static boolean checkOwinCon(JButton[][] buttons) {
        return false;
    }

}
