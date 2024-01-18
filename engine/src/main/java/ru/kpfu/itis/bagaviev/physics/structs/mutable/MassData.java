package ru.kpfu.itis.bagaviev.physics.structs.mutable;

public class MassData {

    private float mass;
    private float angularInertia;

    private float invMass;

    public MassData() {
        invMass = 0f;
    }

    public MassData(float mass, float angularInertia) {
        setMass(mass);
        setAngularInertia(angularInertia);
    }

    public MassData(MassData massData) {
        setMass(massData.mass);
        setAngularInertia(massData.angularInertia);
    }

    public void setMass(float mass) {
        this.mass = mass;
        this.invMass = Float.compare(mass, 0f) == 0 ? 0 : 1 / mass;
    }

    public void setAngularInertia(float angularInertia) {
        this.angularInertia = angularInertia;
    }

    public float getMass() {
        return mass;
    }

    public float getInvMass() {
        return invMass;
    }

    public float getAngularInertia() {
        return angularInertia;
    }

}
