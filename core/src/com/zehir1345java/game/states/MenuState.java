package com.zehir1345java.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.zehir1345java.game.buttons.Button;
import com.zehir1345java.game.imageloder.ImageLoader;
import com.zehir1345java.game.inputhandle.MenuStateInput;

public class MenuState extends State{
    private StateManager stateManager;
    private Button playButton;
    public MenuState(StateManager stateManager) {
        super(stateManager);
        this.stateManager = stateManager;
        camera.setToOrtho(false);
        playButton = new Button(100,600,ImageLoader.btnTextRegion);
        Gdx.input.setInputProcessor(new MenuStateInput(this));
    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.setProjectionMatrix(camera.combined);
        spriteBatch.begin();
        spriteBatch.draw(ImageLoader.bgTexture,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        spriteBatch.end();
        playButton.render(spriteBatch);
    }

    @Override
    public void update(float delta) {

        System.out.println("MenuState ciziliyor");
    }

    @Override
    public void handleInput() {

    }
    public StateManager getStateManager(){

        return  stateManager;
    }
    public Button getPlayButton(){
        return playButton;
    }
}
