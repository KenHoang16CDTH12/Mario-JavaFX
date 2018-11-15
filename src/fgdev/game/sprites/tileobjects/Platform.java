package fgdev.game.sprites.tileobjects;

import javafx.geometry.Rectangle2D;

public class Platform extends Block {
    public Platform(int x, int y) {
        super(x, y);
        //
        block.setViewport(new Rectangle2D(0, 0, 16, 16));
        addBlock();
    }

    @Override
    public void onHeadHit() {

    }
}
