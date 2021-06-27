package com.epam.prejap.tetris.game;

public interface Playfield {
    void nextBlock();

    boolean move(Move move);

    Grid getGrid();

    void findAndRemoveFilledLines();

    public interface BrickAction {
        void act(int i, int j, int dot);
    }
}
