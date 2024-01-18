package ru.kpfu.itis.bagaviev.test;

import ru.kpfu.itis.bagaviev.physics.objects.DynamicBody;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Vector2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BodyKeyListener implements KeyListener {

    private final DynamicBody body;

    private final Vector2 forceUp = new Vector2(0f, -0.01f);
    private final Vector2 forceDown = new Vector2(0f, 0.01f);
    private final Vector2 forceRight = new Vector2(0.01f, 0f);
    private final Vector2 forceLeft = new Vector2(-0.01f, 0f);

    public BodyKeyListener(DynamicBody body) {
        this.body = body;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> body.applyForceToCenter(forceUp);
            case KeyEvent.VK_DOWN -> body.applyForceToCenter(forceDown);
            case KeyEvent.VK_RIGHT -> body.applyForceToCenter(forceRight);
            case KeyEvent.VK_LEFT -> body.applyForceToCenter(forceLeft);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
