package ru.kpfu.itis.bagaviev.physics.shapes;

import ru.kpfu.itis.bagaviev.physics.structs.mutable.AABB;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.MassData;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Material;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Vector2;

;

public abstract class Shape{

    protected final Vector2 center = new Vector2(0f, 0f);

    public void computeCentroid(Vector2 outCenter) {
        outCenter.set(center);
    }

    public abstract ShapeType getShapeType();

    public abstract void computeAABB(AABB outAABB);

    public abstract void computeMassData(Material material, MassData outMassData);

}
