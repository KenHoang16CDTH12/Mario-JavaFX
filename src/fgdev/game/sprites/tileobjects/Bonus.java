package fgdev.game.sprites.tileobjects;

import javafx.geometry.Rectangle2D;

public class Bonus extends Block {
    public Bonus(int x, int y) {
        super(x, y);
        //
        block.setViewport(new Rectangle2D(384, 0, 16, 16));
        addBlock();
    }

    @Override
    public void onHeadHit() {

    }
}
