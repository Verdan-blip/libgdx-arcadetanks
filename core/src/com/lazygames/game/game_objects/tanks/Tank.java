package com.lazygames.game.game_objects.tanks;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.lazygames.game.drawable.Drawable;
import com.lazygames.game.game_objects.corpuses.AbstractCorpus;
import com.lazygames.game.game_objects.towers.AbstractTower;

public class Tank implements Drawable {

    private final AbstractTower tower;
    private final AbstractCorpus corpus;

    public Tank(AbstractTower tower, AbstractCorpus corpus) {
        this.tower = tower;
        this.corpus = corpus;
    }

    void rotate() {

    }

    void move() {

    }

    void fire() {

    }

    @Override
    public void draw(Batch batch) {

    }

}
