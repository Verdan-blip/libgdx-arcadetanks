package ru.kpfu.itis.bagaviev.physics.objects;

import ru.kpfu.itis.bagaviev.physics.shapes.Shape;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Material;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Transform;
import ru.kpfu.itis.bagaviev.physics.world.object.WorldObject;

public interface Body extends WorldObject {
    void computeTransform(Transform outTransform);
    void computeMaterial(Material outMaterial);
    Shape getShape();
}

