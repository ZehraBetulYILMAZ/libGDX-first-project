package com.zehir1345java.game.imageloder;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ImageLoader {
    public static Texture texture , bgTexture, btnTexture;

    public static TextureRegion  textureRegion,bgTextRegiion,btnTextRegion;

    public static void load(){
       texture = new Texture(Gdx.files.internal("./assets/car1.png"));
       bgTexture = new Texture(Gdx.files.internal("./assets/background.jpg"));
       btnTexture = new Texture(Gdx.files.internal("./assets/Button.png"));
       bgTextRegiion = new TextureRegion(bgTexture,0,0, bgTexture.getWidth(), bgTexture.getHeight());
       btnTextRegion = new TextureRegion(btnTexture, 165,2,390,180);
       textureRegion = new TextureRegion(texture,0,0,100,100);
        bgTextRegiion.flip(false,true);
       textureRegion.flip(false,true);


    }
    public static void dispose(){

        texture.dispose();
        btnTexture.dispose();
        bgTexture.dispose();
    }
}
