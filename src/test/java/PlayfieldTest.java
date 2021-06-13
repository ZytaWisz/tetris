import com.epam.prejap.tetris.block.BlockFeed;
import com.epam.prejap.tetris.game.PlayFieldParameters;
import com.epam.prejap.tetris.game.Playfield;
import com.epam.prejap.tetris.game.Printer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlayfieldTest {

    @Test
    public void shouldAddThreeRandomBlocksToThePlayfield() {

        //given
        Playfield playfield = new Playfield(new PlayFieldParameters(20, 10, new BlockFeed(), new Printer(System.out), true));

        //when
        byte[][] grid = playfield.getGrid();

        //than
        Assert.assertTrue(Arrays.stream(grid)
                .map(row -> IntStream.range(0, row.length).map(operand -> row[operand]).sum())
                .mapToInt(Integer::intValue)
                .sum() >= 12);
    }
}
