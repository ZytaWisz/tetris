import com.epam.prejap.tetris.block.BlockFeed;
import com.epam.prejap.tetris.game.Grid;
import com.epam.prejap.tetris.game.PlayFieldParameters;
import com.epam.prejap.tetris.game.PlayfieldWithRandomBlocks;
import com.epam.prejap.tetris.game.Printer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class PlayfieldWithRandomBlocksTest {

    @Test
    public void shouldAddThreeRandomBlocksToThePlayfield() {

        //given
        PlayfieldWithRandomBlocks playfield = new PlayfieldWithRandomBlocks(new PlayFieldParameters(20, 10, new BlockFeed(), new Printer(System.out)));

        //when
        List<Grid.Row> grid = playfield.getGrid().getLines();

        //than
        Assert.assertTrue(grid.stream()
                .map(Grid.Row::getRow)
                .flatMap(Collection::stream)
                .mapToInt(Integer::intValue)
                .sum()>=12);
    }
}
