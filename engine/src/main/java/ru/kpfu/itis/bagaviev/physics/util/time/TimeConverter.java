package ru.kpfu.itis.bagaviev.physics.util.time;

public class TimeConverter {

    public static float nanosecondsToMilliseconds(long nanoseconds) {
        return nanoseconds / 1_000_000f;
    }

    public static float millisecondsToSeconds(float seconds) {
        return seconds / 1_000f;
    }

}
