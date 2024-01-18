package ru.kpfu.itis.bagaviev.physics.structs.mutable;

public class Transform {

    private float centerX, centerY;
    private float angle;

    public Transform() { }

    public Transform(float centerX, float centerY, float angle) {
        setCenter(centerX, centerY);
        setAngle(angle);
    }

    public Transform(Vector2 position, float angle) {
        setCenter(position);
        setAngle(angle);
    }

    public Transform(Transform transform) {
        setCenter(transform.centerX, transform.centerY);
        setAngle(transform.angle);
    }

    public void setCenter(float centerX, float centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public void setCenter(Vector2 center) {
        this.centerX = center.getX();
        this.centerY = center.getY();
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public void computeCenter(Vector2 outCenter) {
        outCenter.set(centerX, centerY);
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public float getAngle() {
        return angle;
    }
}
