package ru.kpfu.itis.bagaviev.physics.structs.mutable;

public class Material {

    private float density;
    private float restitution;
    private float friction;

    public Material() { }

    public Material(float density, float restitution, float friction) {
        setDensity(density);
        setRestitution(restitution);
        setFriction(friction);
    }

    public Material(Material material) {
        setDensity(material.density);
        setRestitution(material.restitution);
        setFriction(material.friction);
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public void setRestitution(float restitution) {
        this.restitution = restitution;
    }

    public void setFriction(float friction) {
        this.friction = friction;
    }

    public float getDensity() {
        return density;
    }

    public float getRestitution() {
        return restitution;
    }

    public float getFriction() {
        return friction;
    }

}
