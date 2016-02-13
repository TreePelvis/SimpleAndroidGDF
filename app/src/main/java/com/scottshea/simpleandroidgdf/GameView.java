package com.scottshea.simpleandroidgdf;

import android.content.Context;
import android.view.SurfaceView;

import com.scottshea.com.scottshea.game.state.State;

/**
 * Created by Scott on 2/12/2016.
 */
public class GameView extends SurfaceView {
    public GameView(Context context, int gameWidth, int gameHeight) {
        super(context);
    }

    public GameView(Context context) {
        super(context);
    }

    public void setCurrentState(State newState) {

    }
}
