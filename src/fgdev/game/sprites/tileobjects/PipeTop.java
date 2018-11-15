package fgdev.game.sprites.tileobjects;

import fgdev.game.Game;
import javafx.geometry.Rectangle2D;

public class PipeTop extends Block {
    public PipeTop(int x, int y) {
        super(x, y);
        //
        block.setViewport(new Rectangle2D(0, 128, 32, 16));
        block.setFitWidth(Game.BLOCK_SIZE * 2);
        addBlock();
    }

    @Override
    public void onHeadHit() {

    }
}
