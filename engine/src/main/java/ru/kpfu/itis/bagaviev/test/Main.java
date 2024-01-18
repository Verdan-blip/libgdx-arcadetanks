package ru.kpfu.itis.bagaviev.test;

import ru.kpfu.itis.bagaviev.physics.objects.DynamicBody;
import ru.kpfu.itis.bagaviev.physics.shapes.CircleShape;
import ru.kpfu.itis.bagaviev.physics.shapes.Shape;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.AABB;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Material;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Transform;
import ru.kpfu.itis.bagaviev.physics.world.ArcadeAABBWorld;

public class Main {

    public static void main(String[] args) {

        ArcadeAABBWorld world = new ArcadeAABBWorld(new AABB(0f, 0f, 300f, 300f), 60);

        Transform transform = new Transform(300f, 300f, 0f);
        Material material = new Material(25f, 0.1f, 0.5f);
        Shape shape = new CircleShape(30f);

        DynamicBody dynamicBody = new DynamicBody(transform, material, shape);
        world.addBody(dynamicBody);

        SwingWindow window = new SwingWindow("Engine test", 600, 600);
        window.add(dynamicBody);
        window.setKeyListener(new BodyKeyListener(dynamicBody));
        window.show();

        while (true) {
            world.step();
            window.repaint();
        }

    }

}