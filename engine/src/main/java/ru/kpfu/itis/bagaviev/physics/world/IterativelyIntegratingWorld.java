package ru.kpfu.itis.bagaviev.physics.world;

import ru.kpfu.itis.bagaviev.physics.util.time.Timer;

public abstract class IterativelyIntegratingWorld implements World {

    private int fps;
    private float dt;
    private float lastFrameTime;
    private float timeAccumulator;

    private final Timer timer;

    public IterativelyIntegratingWorld(int fps) {
        setFps(fps);

        timer = new Timer();
        timer.start();
    }

    @Override
    public void step() {
        float currentFrameTime = timer.elapsed();
        timeAccumulator += currentFrameTime - lastFrameTime;
        lastFrameTime = currentFrameTime;

        if (timeAccumulator > 0.2f) {
            timeAccumulator = 0.2f;
        }

        while (timeAccumulator > dt) {
            update();
            timeAccumulator -= dt;
        }
    }

    public void setFps(int fps) {
        this.fps = fps;
        this.dt = 1f / fps;
    }

    public int getFps() {
        return fps;
    }

    public float getDt() {
        return dt;
    }

}
