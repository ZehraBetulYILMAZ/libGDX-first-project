package com.zehir1345java.game.inputhandle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.zehir1345java.game.states.MenuState;
import com.zehir1345java.game.states.PlayState;

public class MenuStateInput implements InputProcessor {
    private MenuState menuState;
    public MenuStateInput(MenuState menuState){

        this.menuState = menuState;
    }
    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if(menuState.getPlayButton().getButtonRectangle().contains(screenX,Gdx.graphics.getHeight()-screenY)) {
            System.out.println(screenX);
            System.out.println(screenY);
            System.out.println(menuState.getPlayButton().getButtonRectangle().contains(screenX,screenY));
            menuState.getStateManager().pushState(new PlayState(menuState.getStateManager()));
        }
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}
