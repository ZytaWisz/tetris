package com.epam.prejap.tetris.game;

import com.epam.prejap.tetris.block.BlockFeed;

public record PlayFieldParameters(
        int rows,
        int cols,
        BlockFeed feed,
        Printer printer){
}

