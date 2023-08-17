package com.zehir1345java.game.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Backgrouond implements GameObject{
    float bas,son,width,height;
    private TextureRegion textureRegion;

    public Backgrouond(float bas, float son, TextureRegion textureRegion,float width,float height) {
        this.bas = bas;
        this.son = son;
        this.textureRegion = textureRegion;
        this.width = width;
        this.height = height;
    }

    public float getBas() {
        return bas;
    }

    public void setBas(float bas) {
        this.bas = bas;
    }

    public float getSon() {
        return son;
    }

    public void setSon(float son) {
        this.son = son;
    }

    @Override
    public void render(SpriteBatch spriteBatch) {
       spriteBatch.begin();
       spriteBatch.draw(textureRegion,bas,son,width,height);
       spriteBatch.end();
    }

    @Override
    public void update(float delta) {

    }

}
