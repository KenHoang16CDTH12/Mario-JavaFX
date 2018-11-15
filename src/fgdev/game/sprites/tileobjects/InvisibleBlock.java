package fgdev.game.sprites.tileobjects;

import javafx.geometry.Rectangle2D;

public class InvisibleBlock extends Block {
    public InvisibleBlock(int x, int y) {
        super(x, y);
        //
        block.setViewport(new Rectangle2D(0, 0, 16, 16));
        block.setOpacity(0);
        addBlock();
    }

    @Override
    public void onHeadHit() {

    }
}
