package com.zehir1345java.game.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zehir1345java.game.controller.Controller;

public class GameWorld implements GameObject{

    private Player player;
    private Controller controller;
    public GameWorld(){
        controller = new Controller(350,650,50);
        player = new Player(50,50,100,100,controller.getDirection());

    }
    public void render(SpriteBatch spriteBatch) {

        player.render(spriteBatch);
        controller.render();
    }

    public void update(float delta) {

        player.update(delta);
        controller.update(delta);
    }
    public Player getPlayer(){

        return  player;
    }
    public Controller getController(){
        return controller;
    }
}
