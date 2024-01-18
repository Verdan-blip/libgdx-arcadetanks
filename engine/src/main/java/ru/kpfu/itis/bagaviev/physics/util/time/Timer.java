package ru.kpfu.itis.bagaviev.physics.util.time;

public class Timer {

    private long startTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public long elapsed() {
        return System.nanoTime() - startTime;
    }

}
