package com.zehir1345java.game.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zehir1345java.game.imageloder.ImageLoader;

import java.util.SplittableRandom;

public class Player implements GameObject{
    private float xKord;
    private float yKord;
    private float width;
    private float height;
    private float speed;
    private float acceleration;
    private float maxSpeed;
    private float minSpeed;

    private boolean left=false,right=false,up=false,down=false;
    public Player(float xKord, float yKord, float width, float height){
        this.xKord = xKord;
        this.yKord = yKord;
        this.width = width;
        this.height = height;
        speed = 0;
        acceleration=0.02f;
        maxSpeed=12;
        minSpeed=0;
    }
    @Override
    public void render(SpriteBatch spriteBatch) {
       spriteBatch.begin();
       spriteBatch.draw(ImageLoader.textureRegion,xKord,yKord,width,height);
       spriteBatch.end();
    }

    @Override
    public void update(float delta) {
      speed+=acceleration;
      move();
    }
    public void move(){
        if(left) xKord-=speed;
        if(right) xKord+=speed;
        if(down) yKord+=speed;
        if(up) yKord-=speed;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void stop(){
        left = false;
        right = false;
        down = false;
        up = false;
    }
}
