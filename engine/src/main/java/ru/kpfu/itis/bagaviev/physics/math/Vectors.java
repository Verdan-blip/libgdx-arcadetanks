package ru.kpfu.itis.bagaviev.physics.math;

import ru.kpfu.itis.bagaviev.physics.structs.mutable.Vector2;

public class Vectors {

    public static float dotProduct(Vector2 vectorA, Vector2 vectorB) {
        return vectorA.getX() * vectorB.getX() + vectorA.getY() * vectorB.getY();
    }

    public static float skewProduct(Vector2 vectorA, Vector2 vectorB) {
        return vectorA.getX() * vectorB.getX() + vectorA.getY() * vectorB.getY();
    }

}
