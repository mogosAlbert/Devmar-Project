package com.devamrboxaiscratch.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import player.charPlayer;

public class BoxAi extends Game {
	SpriteBatch batch;
        World world;
	Texture img;
        //My player
        charPlayer mainPlayer;
        Vector2 playerVec;
        Vector2 enemyVec;
        
	
	@Override
	public void create () {
            world = new World(new Vector2(0,0f), false);
            playerVec = new Vector2(50,50);
            enemyVec = new Vector2(500,500);
            batch = new SpriteBatch();
            mainPlayer = new charPlayer(world,playerVec,enemyVec,batch);
	}

	@Override
	public void render () {
            super.render();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
                batch.begin();
		mainPlayer.update();
		batch.end();
	}
}
