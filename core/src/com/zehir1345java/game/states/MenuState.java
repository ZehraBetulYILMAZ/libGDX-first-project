package com.zehir1345java.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuState extends State{
    @Override
    public void render(SpriteBatch spriteBatch) {
        System.out.println("MenuState başlatıldı");
    }

    @Override
    public void update(float delta) {
        System.out.println("MenuState ciziliyor");
    }

    @Override
    public void handleInput() {

    }
}
