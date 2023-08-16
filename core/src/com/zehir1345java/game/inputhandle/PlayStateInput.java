package com.zehir1345java.game.inputhandle;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;
import com.zehir1345java.game.states.MenuState;
import com.zehir1345java.game.states.PlayState;

public class PlayStateInput implements InputProcessor {
    private PlayState playState;
    Vector2 newV;
    public PlayStateInput(PlayState playState){
       this.playState = playState;
       newV = playState.getGameWorld().getController().getBeginCord();
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
            case Keys.A : playState.getGameWorld().getPlayer().setLeft(false);
                break;
            case Keys.S : playState.getGameWorld().getPlayer().setDown(false);
                break;
            case Keys.D : playState.getGameWorld().getPlayer().setRight(false);
                break;
            case Keys.W : playState.getGameWorld().getPlayer().setUp(false);
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

        if(playState.getBackButton().getButtonRectangle().contains(screenX,screenY)){
            playState.getStateManager().pushState(new MenuState(playState.getStateManager()));
        }
        playState.getGameWorld().getController().setClick(true);
        playState.getGameWorld().getPlayer().setMovewithDirection(true);
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        playState.getGameWorld().getController().setClick(false);
        playState.getGameWorld().getPlayer().setMovewithDirection(false);

        playState.getGameWorld().getController().setEndCord(new Vector2(newV.x,newV.y));
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
