package com.zehir1345java.game.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zehir1345java.game.controller.Controller;
import com.zehir1345java.game.handler.BgHandler;

public class GameWorld implements GameObject{

    private Player player;
    private Controller controller;
    private BgHandler bgHandler;
    public GameWorld(){
        controller = new Controller(80,700,50);
        player = new Player(200,400,50,50,controller.getDirection());
        bgHandler = new BgHandler(player);

    }
    public void render(SpriteBatch spriteBatch) {
        bgHandler.render(spriteBatch);
        player.render(spriteBatch);
        controller.render();
    }

    public void update(float delta) {
        bgHandler.update(delta);
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
