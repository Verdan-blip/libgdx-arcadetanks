package ru.kpfu.itis.bagaviev.physics.objects;

import ru.kpfu.itis.bagaviev.physics.math.Vectors;
import ru.kpfu.itis.bagaviev.physics.shapes.Shape;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.MassData;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Material;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Transform;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Vector2;

public class DynamicBody extends AbstractBody {

    private final Vector2 forces;
    private float torques;

    private final Vector2 linearVelocity;
    private float angularVelocity;

    private final MassData massData;

    public DynamicBody(Transform transform, Material material, Shape shape) {
        super(transform, material, shape);

        forces = new Vector2();
        torques = 0f;

        linearVelocity = new Vector2();
        angularVelocity = 0f;

        massData = new MassData();
        shape.computeMassData(material, massData);
    }

    public void applyForceToCenter(Vector2 force) {
        forces.add(force);
    }

    public void applyForce(Vector2 force, Vector2 localPoint) {
        forces.add(force);

        localPoint.subtract(shapeCentroid);
        torques += Vectors.skewProduct(localPoint, force);
    }

    public void applyTorque(float torque) {
        torques += torque;
    }

    public void update(float dt) {

        //Updating velocities
        linearVelocity.add(
                forces.getX() / massData.getMass() * dt,
                forces.getY() / massData.getMass() * dt
        );
        angularVelocity += torques / massData.getAngularInertia();

        //Updating position
        transform.setCenter(
                transform.getCenterX() + linearVelocity.getX() * dt,
                transform.getCenterY() + linearVelocity.getY() * dt
        );
        transform.setAngle(transform.getAngle() + angularVelocity * dt);
    }

    @Override
    void computeMassData(MassData outMassData) {
        outMassData.setMass(massData.getMass());
        outMassData.setAngularInertia(massData.getAngularInertia());
    }

    void computeLinearVelocity(Vector2 linearVelocity) {
        linearVelocity.set(this.linearVelocity);
    }

    void computeForces(Vector2 forces) {
        forces.set(this.forces);
    }

    public float getTorques() {
        return torques;
    }

    public float getAngularVelocity() {
        return angularVelocity;
    }

    public void setLinearVelocity(Vector2 linearVelocity) {
        this.linearVelocity.set(linearVelocity);
    }

    public void setAngularVelocity(float angularVelocity) {
        this.angularVelocity = angularVelocity;
    }

    public void setForces(Vector2 forces) {
        this.forces.set(forces);
    }

    public void setTorques(float torques) {
        this.torques = torques;
    }

    public float getLinearVelocityX() {
        return linearVelocity.getX();
    }

    public float getLinearVelocityY() {
        return linearVelocity.getY();
    }

    public float getForcesX() {
        return forces.getX();
    }

    public float getForcesY() {
        return forces.getY();
    }

}
