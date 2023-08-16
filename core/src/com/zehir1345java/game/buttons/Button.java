package com.zehir1345java.game.buttons;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.zehir1345java.game.gameobject.GameObject;
import com.zehir1345java.game.imageloder.ImageLoader;

public class Button implements GameObject {

    private float xKord, yKord,height,width;
    private TextureRegion textureRegion;
    private Rectangle btnRectangle;
    public Button(float xKord,float yKord,TextureRegion textureRegion){
        this.xKord = xKord;
        this.yKord = yKord;
        height = 80;
        width = 300;
        this.textureRegion = textureRegion;
        btnRectangle = new Rectangle(xKord,yKord,width,height);
    }
    public Button(){
        this.xKord = 0;
        this.yKord = 0;
        height = 80;
        width = 300;
        this.textureRegion = ImageLoader.bgTextRegiion;
        btnRectangle = new Rectangle(xKord,yKord,width,height);
    }
    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.begin();
        spriteBatch.draw(textureRegion,xKord,yKord,width,height);
        spriteBatch.end();
    }

    @Override
    public void update(float delta) {

    }
    public Rectangle getButtonRectangle(){
        return btnRectangle;
    }
}
