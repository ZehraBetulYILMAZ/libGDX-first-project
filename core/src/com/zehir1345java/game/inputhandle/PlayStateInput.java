package com.zehir1345java.game.inputhandle;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Input.Keys;
import com.zehir1345java.game.states.PlayState;

public class PlayStateInput implements InputProcessor {
    private PlayState playState;
    public PlayStateInput(PlayState playState){
       this.playState = playState;
    }
    @Override
    public boolean keyDown(int keycode) {
        switch(keycode){
            case Keys.A : playState.getGameWorld().getPlayer().setLeft(true);
            break;
            case Keys.S : playState.getGameWorld().getPlayer().setDown(true);
                break;
            case Keys.D : playState.getGameWorld().getPlayer().setRight(true);
                break;
            case Keys.W : playState.getGameWorld().getPlayer().setUp(true);
                break;
            default: System.out.println("playsteate dokunuldu");
            break;
        }

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        switch(keycode){
            case Keys.A : playState.getGameWorld().getPlayer().stop();
                break;
            case Keys.S : playState.getGameWorld().getPlayer().stop();
                break;
            case Keys.D : playState.getGameWorld().getPlayer().stop();
                break;
            case Keys.W : playState.getGameWorld().getPlayer().stop();
                break;
            default: System.out.println("playsteate dokunuldu");
                break;
        }
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
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
