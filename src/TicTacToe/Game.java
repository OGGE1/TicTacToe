package TicTacToe;

import TicTacToe.GUI.GameWindow;

import javax.swing.*;

public class Game {

    GameWindow gameWindow;
    ActionListeners actionListeners;

    public void init() {
        gameWindow = new GameWindow();
        actionListeners = new ActionListeners(gameWindow);
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.init();
    }
}
