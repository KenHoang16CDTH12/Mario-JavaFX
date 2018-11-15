package fgdev.game.sprites.tileobjects;

import javafx.geometry.Rectangle2D;

public class Brick extends Block {
    public Brick(int x, int y) {
        super(x, y);
        //
        block.setViewport(new Rectangle2D(16, 0, 16, 16));
        addBlock();
    }

    @Override
    public void onHeadHit() {

    }
}
