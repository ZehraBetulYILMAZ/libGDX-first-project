package com.zehir1345java.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.PolygonRegion;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zehir1345java.game.buttons.Button;
import com.zehir1345java.game.gameobject.GameWorld;
import com.zehir1345java.game.gameobject.Player;
import com.zehir1345java.game.imageloder.ImageLoader;
import com.zehir1345java.game.inputhandle.PlayStateInput;

public class PlayState extends State{

    private GameWorld gameWorld;
    private Button backButton;
    private StateManager stateManager;
    public PlayState(StateManager stateManager){
        super(stateManager);
        this.stateManager = stateManager;
        gameWorld = new GameWorld();
        backButton = new Button();
        Gdx.input.setInputProcessor(new PlayStateInput(this));
    }
    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.setProjectionMatrix(camera.combined);
         gameWorld.render(spriteBatch);
         backButton.render(spriteBatch);

    }

    @Override
    public void update(float delta) {
       gameWorld.update(delta);
    }

    @Override
    public void handleInput() {
        if (Gdx.input.isTouched()){
            System.out.println("PlayState dokunuldu") ;
        }
    }
    public GameWorld getGameWorld(){
        return gameWorld;
    }
    public Button getBackButton(){
        return  backButton;
    }
    public StateManager getStateManager(){
        return  stateManager;
    }
}
