package TicTacToe;

import TicTacToe.GUI.GameWindow;
import TicTacToe.GameLogic.GameLogic;

import javax.swing.*;

import static TicTacToe.Constants.*;

public class ActionListeners {

    public ActionListeners(GameWindow gameWindow) {
        addActionListenersToArray(gameWindow);

        gameWindow.getResetButton().addActionListener(l -> {
            gameWindow.setButtons(GameLogic.fillGrid());
            gameWindow.updateGUI();
            addActionListenersToArray(gameWindow);
            Xused = false;
        });
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
                    if (GameLogic.checkOwinCon(gameWindow)) {
                        int reply = JOptionPane.showConfirmDialog(null, "0 vann! Spela igen?", "0 vann", JOptionPane.YES_NO_OPTION);
                        if(reply == 0) {
                            gameWindow.setButtons(GameLogic.fillGrid());
                            gameWindow.updateGUI();
                            addActionListenersToArray(gameWindow);
                        } else
                            System.exit(0);
                    }

                    if (GameLogic.checkXwinCon(gameWindow)){
                        int reply = JOptionPane.showConfirmDialog(null, "X vann! Spela igen?", "X vann", JOptionPane.YES_NO_OPTION);
                        if(reply == 0) {
                            gameWindow.setButtons(GameLogic.fillGrid());
                            gameWindow.updateGUI();
                            addActionListenersToArray(gameWindow);
                        } else
                            System.exit(0);
                    }

                });
            }
        }
    }
}
