package fgdev.game.sprites.tileobjects;

import fgdev.game.Game;
import javafx.geometry.Rectangle2D;

public class PipeBottom extends Block {
    public PipeBottom(int x, int y) {
        super(x, y);
        //
        block.setViewport(new Rectangle2D(0, 145, 32, 14));
        block.setFitWidth(Game.BLOCK_SIZE * 2);
        addBlock();
    }

    @Override
    public void onHeadHit() {

    }
}
