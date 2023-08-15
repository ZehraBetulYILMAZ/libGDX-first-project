package com.zehir1345java.game.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameWorld implements GameObject{

    private Player player;

    public GameWorld(){
        player = new Player(50,50,100,100);
    }
    public void render(SpriteBatch spriteBatch) {
      player.render(spriteBatch);
    }

    public void update(float delta) {
       player.update(delta);
    }
    public Player getPlayer(){
        return  player;
    }
}
