package com.zehir1345java.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class StateManager {
    private Stack<State> states;

    public StateManager() {
      states = new Stack<State>();
    }
    public void render(SpriteBatch spriteBatch) {
        states.peek().render(spriteBatch);
    }
    public void update(float delta) {
       states.peek().update(delta);
       states.peek().handleInput();
    }
    public void popState(){
        states.pop();
    }
    public void pushState(State state){
        states.push(state);
    }
}
