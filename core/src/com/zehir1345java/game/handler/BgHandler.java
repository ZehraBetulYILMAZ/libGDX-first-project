package com.zehir1345java.game.handler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zehir1345java.game.gameobject.Backgrouond;
import com.zehir1345java.game.gameobject.Player;
import com.zehir1345java.game.imageloder.ImageLoader;

public class BgHandler {
  //  private Backgrouond bg1,bg2,bg3;
    private Player player;
    private float bg1bas, bg1son,bg2bas, bg2son,bg3bas, bg3son;
    private float width,height;
    public BgHandler(Player player) {
       width = Gdx.graphics.getWidth();
       height = Gdx.graphics.getHeight();
       this.player = player;
     bg1bas = - height;
     bg1son = bg1bas + height;
     bg2bas = bg1son;
     bg2son = bg2bas + height;
     bg3bas = bg2son;
     bg2son = bg3bas + height;
     // bg1 = new Backgrouond(0,-height, ImageLoader.bgTextRegiion,width,height);
     // bg2 = new Backgrouond(0,0,ImageLoader.bgTextRegiion,width,height);
     // bg3 = new Backgrouond(0,height*2,ImageLoader.bgTextRegiion,width,height);
    }

    public void render(SpriteBatch spriteBatch) {
     // bg1.render(spriteBatch);
     // bg2.render(spriteBatch);
     // bg3.render(spriteBatch);
       spriteBatch.begin();
       spriteBatch.draw(ImageLoader.bgTextRegiion,0,bg1bas,width,height);
       spriteBatch.draw(ImageLoader.bgTextRegiion,0,bg2bas,width,height);
       spriteBatch.draw(ImageLoader.bgTextRegiion,0,bg3bas,width,height);
       spriteBatch.end();
    }

    public void update(float delta) {

         if(player.getyKord()<bg2bas) {
             updateCord();
         }

    }
    public void updateCord(){
        // bg3.setBas(bg1.getBas()-height);
        // bg1.setBas(bg3.getBas());
        // bg2.setBas(bg1.getBas()+height);
        // bg3.setBas(bg2.getBas()+height);
        bg3bas =  bg1bas - height;
        bg1bas = bg3bas;
        bg2bas = bg1bas + height;
        bg3bas = bg2bas+height;
    }
}
