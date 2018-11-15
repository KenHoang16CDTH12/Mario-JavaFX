package fgdev.game.common;

public interface ApplicationListener {

    void create();

    void render();

    void resize(int width, int height);

    void pause();

    void resume();

    void dispose();

}
