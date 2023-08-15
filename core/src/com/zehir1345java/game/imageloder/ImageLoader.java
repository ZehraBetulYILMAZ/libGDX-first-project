package com.zehir1345java.game.imageloder;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ImageLoader {
    public static Texture texture;
    public static TextureRegion  textureRegion;

    public static void load(){
       texture = new Texture(Gdx.files.internal("./assets/car1.png"));
       textureRegion = new TextureRegion(texture,0,0,100,100);
       textureRegion.flip(false,true);

    }
    public static void dispose(){
      texture.dispose();
    }
}
