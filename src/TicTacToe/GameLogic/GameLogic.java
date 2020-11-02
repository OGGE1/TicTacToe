package TicTacToe.GameLogic;
import TicTacToe.Constants;
import TicTacToe.GUI.GameWindow;

import javax.swing.*;

import java.awt.*;

import static TicTacToe.Constants.*;

public abstract class GameLogic {

    public static JButton[][] fillGrid() {
        JButton[][] out = new JButton[ROWS][Constants.COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < Constants.COLUMNS; j++) {
                JButton button = new JButton();
                button.setFont(new Font("Helvetica", Font.BOLD, 40));
                out[i][j] = button;
            }
        }
        return out;
    }

    public static boolean checkXwinCon(GameWindow g) {
        if (g.getButtons()[0][0].getText().equals(X) && g.getButtons()[0][1].getText().equals(X)
                && g.getButtons()[0][2].getText().equals(X))
            return true;
        else if (g.getButtons()[1][0].getText().equals(X) && g.getButtons()[1][1].getText().equals(X)
                && g.getButtons()[1][2].getText().equals(X))
            return true;
        else if (g.getButtons()[2][0].getText().equals(X) && g.getButtons()[2][1].getText().equals(X)
                && g.getButtons()[2][2].getText().equals(X))
            return true;
        else if (g.getButtons()[0][2].getText().equals(X) && g.getButtons()[1][2].getText().equals(X)
                && g.getButtons()[2][2].getText().equals(X))
            return true;
        else if (g.getButtons()[0][1].getText().equals(X) && g.getButtons()[1][1].getText().equals(X)
                && g.getButtons()[2][1].getText().equals(X))
            return true;
        else if (g.getButtons()[0][0].getText().equals(X) && g.getButtons()[1][0].getText().equals(X)
                && g.getButtons()[2][0].getText().equals(X))
            return true;
        else if (g.getButtons()[0][0].getText().equals(X) && g.getButtons()[1][1].getText().equals(X)
                && g.getButtons()[2][2].getText().equals(X))
            return true;

        return false;
    }

    public static boolean checkOwinCon(GameWindow gameWindow) {
        
    }

}
