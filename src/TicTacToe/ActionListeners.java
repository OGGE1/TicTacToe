package TicTacToe;

import TicTacToe.GUI.GameWindow;

import static TicTacToe.Constants.*;

public class ActionListeners {

    public ActionListeners(GameWindow gameWindow) {
        addActionListenersToArray(gameWindow);
    }

    public void addActionListenersToArray(GameWindow gameWindow) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                int r = i;
                int c = j;
                gameWindow.getButtons()[i][j].addActionListener(l -> {
                    if (gameWindow.getButtons()[r][c].getText().isBlank()) {
                        if (!Xused) {
                            gameWindow.getButtons()[r][c].setText(X);
                            Xused = true;
                        } else {
                            gameWindow.getButtons()[r][c].setText(O);
                            Xused = false;
                        }
                    }

                });
            }
        }
    }

}
