package com.epam.prejap.tetris.game;

import java.util.Random;

public class PlayfieldWithRandomBlocks extends AbstractPlayfield {

    public PlayfieldWithRandomBlocks(PlayFieldParameters playFieldParameters) {
        super(playFieldParameters);
        addRandomBlocks();
    }
    /**
     * Method adds three random blocks to the bottom of the playfield
     *
     * @author Zyta Wiszniewska
     */
    protected void addRandomBlocks() {
        var random = new Random();
        for (int i = 0; i < 3; i++) {
            block = feed.nextBlock();
            col = random.nextInt(cols - block.cols() + 1);
            row = 0;
            forEachBrick((k, j, dot) -> grid[row + k][col + j] = dot);
            boolean moved;
            do {
                forEachBrick((k, j, dot) -> grid[row + k][col + j] = 0);
                moved = moveDown();
                forEachBrick((k, j, dot) -> grid[row + k][col + j] = dot);
            } while (moved);

        }
    }
}
