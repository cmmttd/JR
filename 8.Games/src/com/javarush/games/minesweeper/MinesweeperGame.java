package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class MinesweeperGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                setCellColor(i, j, Color.WHITE);
            }
        }

    }
}
