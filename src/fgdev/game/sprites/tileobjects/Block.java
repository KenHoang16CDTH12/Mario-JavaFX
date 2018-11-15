package fgdev.game.sprites.tileobjects;

import fgdev.game.Game;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public abstract class Block extends Pane {
    Image blocksImg = new Image(getClass().getResourceAsStream("../../assets/static-assets.png"));
    ImageView block;

    public Block(int x, int y) {
        block = new ImageView(blocksImg);
        block.setFitWidth(Game.BLOCK_SIZE);
        block.setFitHeight(Game.BLOCK_SIZE);
        setTranslateX(x);
        setTranslateY(y);
    }

    protected void addBlock() {
        getChildren().addAll(block);
        Game.platforms.add(this);
        Game.gameRoot.getChildren().add(this);
    }

    public abstract void onHeadHit();

}
