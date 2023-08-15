package com.zehir1345java.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.zehir1345java.game.main.TapMe;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setWindowedMode(TapMe.WIDTH , TapMe.HEIGTH);
		config.setTitle(TapMe.TITLE);
		new Lwjgl3Application(new TapMe(), config);
	}
}
