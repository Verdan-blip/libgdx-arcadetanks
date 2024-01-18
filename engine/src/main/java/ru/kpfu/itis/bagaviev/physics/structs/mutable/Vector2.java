package ru.kpfu.itis.bagaviev.physics.structs.mutable;

public class Vector2 {

    private float x, y;

    public Vector2() { }

    public Vector2(float x, float y) {
        set(x, y);
    }

    public Vector2(Vector2 vector) {
        set(vector);
    }

    public void set(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void set(Vector2 vector) {
        this.x = vector.x;
        this.y = vector.y;
    }

    public void add(Vector2 vector) {
        this.x += vector.x;
        this.y += vector.y;
    }

    public void add(float x, float y) {
        this.x += x;
        this.y += y;
    }

    public void subtract(Vector2 vector) {
        this.x -= vector.x;
        this.y -= vector.y;
    }

    public void subtract(float x, float y) {
        this.x -= x;
        this.y -= y;
    }

    public void normalize() {
        float len = length();
        x /= len;
        y /= len;
    }

    public float length() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public float squaredLength() {
        return x * x + y * y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

}
