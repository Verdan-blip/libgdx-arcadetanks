package ru.kpfu.itis.bagaviev.physics.objects;

import ru.kpfu.itis.bagaviev.physics.shapes.Shape;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.MassData;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Material;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Transform;

public class StaticBody extends AbstractBody {

    public static final float STATIC_BODY_MASS = 0f;
    public static final float STATIC_BODY_ANGULAR_INERTIA = 0f;

    public StaticBody(Transform transform, Material material, Shape shape) {
        super(transform, material, shape);
    }

    @Override
    public void update(float dt) { }

    @Override
    void computeMassData(MassData outMassData) {
        outMassData.setMass(STATIC_BODY_MASS);
        outMassData.setAngularInertia(STATIC_BODY_ANGULAR_INERTIA);
    }

}
