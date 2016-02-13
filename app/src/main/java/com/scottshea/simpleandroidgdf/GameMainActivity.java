package com.scottshea.simpleandroidgdf;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;

/**
 * Created by Scott on 2/12/2016.
 */
public class GameMainActivity extends Activity {
    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 450;
    public static GameView sGame;
    public static AssetManager assets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assets = getAssets();
        sGame = new GameView(this, GAME_WIDTH, GAME_HEIGHT);
        setContentView(sGame);
    }
}
