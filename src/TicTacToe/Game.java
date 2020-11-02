package TicTacToe;

import TicTacToe.GUI.GameWindow;

import javax.swing.*;

public class Game {

    GameWindow gameWindow;
    ActionListeners actionListeners;

    public Game() {
        init();
    }

    public void init() {
        gameWindow = new GameWindow();
        actionListeners = new ActionListeners(gameWindow);
    }

    public static void main(String[] args) {
        new Game();
    }
}
