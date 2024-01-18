package ru.kpfu.itis.bagaviev.physics.structs.mutable;

public class AABB {

    private float centerX, centerY;
    private float halfSizeX, halfSizeY;

    public AABB() { }

    public AABB(Vector2 center, Vector2 halfSize) {
        setCenter(center);
        setHalfSize(halfSize);
    }

    public AABB(float centerX, float centerY, float halfSizeX, float halfSizeY) {
        setCenter(centerX, centerY);
        setHalfSize(halfSizeX, halfSizeY);
    }

    public void setCenter(Vector2 center) {
        this.centerX = center.getX();
        this.centerY = center.getY();
    }

    public void setCenter(float centerX, float centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public void setHalfSize(Vector2 halfSize) {
        this.halfSizeX = halfSize.getX();
        this.halfSizeY = halfSize.getY();
    }

    public void setHalfSize(float halfSizeX, float halfSizeY) {
        this.halfSizeX = halfSizeX;
        this.halfSizeY = halfSizeY;
    }

    public void computeCenter(Vector2 outPosition) {
        outPosition.set(centerX, centerY);
    }

    public void computeHalfSize(Vector2 outHalfSize) {
        outHalfSize.set(halfSizeX, halfSizeY);
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public float getHalfSizeX() {
        return halfSizeX;
    }

    public float getHalfSizeY() {
        return halfSizeY;
    }

}
