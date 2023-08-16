package com.zehir1345java.game.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.zehir1345java.game.imageloder.ImageLoader;

import java.util.SplittableRandom;
import java.util.Vector;

public class Player implements GameObject{
    private float xKord,yKord,width,height;
    private float speed,maxSpeed,minSpeed,acceleration;
    private boolean left=false,right=false,up=false,down=false;
    private boolean movewithDirection=false;
    private Vector2 direction;
    public Player(float xKord, float yKord, float width, float height,Vector2 vector2){
        this.xKord = xKord;
        this.yKord = yKord;
        this.width = width;
        this.height = height;
        speed = 0;
        acceleration=0.02f;
        maxSpeed=12;
        minSpeed=0;
        direction = vector2;
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
      if(movewithDirection){
          xKord += direction.x/100;
          yKord += direction.y/100;
      }
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

    public void setMovewithDirection(boolean movewithDirection) {
        this.movewithDirection = movewithDirection;
    }
}
