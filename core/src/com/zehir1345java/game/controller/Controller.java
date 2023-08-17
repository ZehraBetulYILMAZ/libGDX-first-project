package com.zehir1345java.game.controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

public class Controller {
    private float xKord, yKord,radius;
    private boolean isClick=false;
    private Vector2 beginCord , endCord,direction;
    private ShapeRenderer shapeRenderer;
    private OrthographicCamera camera;


    public  Controller(float xKord, float yKord, float radius){
        this.radius = radius;
        this.xKord = xKord;
        this.yKord = yKord;
        camera = new OrthographicCamera();
        camera.setToOrtho(true, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(camera.combined);
        beginCord = new Vector2();
        endCord = new Vector2();
        direction = new Vector2();
        beginCord.x = xKord;
        beginCord.y= yKord;
        endCord.x = xKord;
        endCord.y = yKord;
    }
    public void update(float delta){
        if(isClick) {
            endCord.x = Gdx.input.getX();
            endCord.y = Gdx.input.getY();
            direction.x = (endCord.x-beginCord.x)/25;
            direction.y = (endCord.y-beginCord.y)/25;
        }
    }
    public void render(){
       shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
       shapeRenderer.setColor(Color.BLUE);
       shapeRenderer.circle(xKord,yKord,radius);
       shapeRenderer.line(beginCord,endCord);
       shapeRenderer.end();
    }

    public void setClick(boolean click) {
        isClick = click;
    }
    public Vector2 getDirection() {
        return direction;
    }

    public Vector2 getBeginCord() {
        return beginCord;
    }

    public void setBeginCord(Vector2 beginCord) {
        this.beginCord = beginCord;
    }

    public Vector2 getEndCord() {
        return endCord;
    }

    public void setEndCord(Vector2 endCord) {
        this.endCord = endCord;
    }
}
