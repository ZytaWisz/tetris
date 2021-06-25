package com.epam.prejap.tetris.block;

import com.epam.prejap.tetris.logger.Logger;
import com.epam.prejap.tetris.game.Color;

final class OBlock extends Block {
    private static final Logger LOGGER = Logger.getLogger(OBlock.class);
    private static final byte COLOR_ID = Color.RED.id;

    /**
     * Byte array represents "O" block.
     * In game will be displayed as (between lines):
     *  -------------------
     *      ##
     *      ##
     *  -------------------
     */
    private static final byte[][] IMAGE = {
        {COLOR_ID, COLOR_ID},
        {COLOR_ID, COLOR_ID},
    };

    public OBlock() {
        super(IMAGE);
        LOGGER.trace("{} was created", getClass().getSimpleName());
    }

}
