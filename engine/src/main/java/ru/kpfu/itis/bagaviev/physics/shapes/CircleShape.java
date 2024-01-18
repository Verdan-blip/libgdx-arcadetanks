package ru.kpfu.itis.bagaviev.physics.shapes;

import ru.kpfu.itis.bagaviev.physics.structs.mutable.AABB;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.MassData;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Material;

public class CircleShape extends Shape {

    private final float radius;

    public CircleShape(float radius) {
       this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.CIRCLE;
    }

    @Override
    public void computeAABB(AABB outAABB) {
        outAABB.setCenter(center);
        outAABB.setHalfSize(radius, radius);
    }

    @Override
    public void computeMassData(Material material, MassData outMassData) {
        float square = (float) Math.PI * radius * radius;
        float mass = square * material.getDensity();
        outMassData.setMass(mass);
        outMassData.setAngularInertia(square);
    }

}
