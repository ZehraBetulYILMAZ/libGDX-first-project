package com.zehir1345java.game.main;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zehir1345java.game.imageloder.ImageLoader;
import com.zehir1345java.game.states.PlayState;
import com.zehir1345java.game.states.StateManager;

public class TapMe extends Game {
    public static int WIDTH = 480;
    public static int HEIGTH= 800;
	public static String TITLE= "TapMe Game";
   private StateManager stateManager;
   private SpriteBatch spriteBatch;

	@Override
	public void create() {
		Gdx.gl.glClearColor(0.1f,0.1f ,  0.1f,1);
        System.out.println("Oyun başlatıldı");
		ImageLoader.load();
		stateManager = new StateManager();
		stateManager.pushState(new PlayState());
		spriteBatch = new SpriteBatch();
	}
	@Override
	public  void render(){
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stateManager.render(spriteBatch);
		stateManager.update(Gdx.graphics.getDeltaTime());
	}
	@Override
	public void dispose(){
		ImageLoader.dispose();
		System.out.println("Oyun bitti");
	}
}
