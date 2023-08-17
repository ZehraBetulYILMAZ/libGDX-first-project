package com.zehir1345java.game.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.zehir1345java.game.imageloder.ImageLoader;

import java.util.SplittableRandom;
import java.util.Vector;

public class Player implements GameObject{
    private float xKord,yKord,width,height;
    private float speedX,speedY,maxSpeed,minSpeed,acceleration;
    private boolean left=false,right=false,up=false,down=false;
    private boolean movewithDirection=false;
    private Vector2 direction;
    public Player(float xKord, float yKord, float width, float height,Vector2 vector2){
        this.xKord = xKord;
        this.yKord = yKord;
        this.width = width;
        this.height = height;
        speedX = 0;
        speedY=0;
        acceleration=0.02f;
        maxSpeed=3;
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
     // move();
        if (movewithDirection) {
            if (speedX <= maxSpeed) {
                speedX += direction.x / 100;
                if (speedX > maxSpeed) {
                    speedX = maxSpeed; // Hızı maxSpeed değerine sınırla
                }
            }
            if (speedY <= maxSpeed) {
                speedY += direction.y / 100;
                if (speedY > maxSpeed) {
                    speedY = maxSpeed; // Hızı maxSpeed değerine sınırla
                }
            }
            xKord += speedX;
            yKord += speedY;
        }
    }
    public void move(){
        if(left) xKord-=speedX;
        if(right) xKord+=speedX;
        if(down) yKord+=speedY;
        if(up) yKord-=speedY;
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

    public float getxKord() {
        return xKord;
    }

    public float getyKord() {
        return yKord;
    }

    public float getSpeedX() {
        return speedX;
    }

    public float getSpeedY() {
        return speedY;
    }
}
