package com.epam.prejap.tetris.game;

public interface Playfield {
    void nextBlock();

    boolean move(Move move);

    byte[][] getGrid();

    public interface BrickAction {
        void act(int i, int j, byte dot);
    }
}
