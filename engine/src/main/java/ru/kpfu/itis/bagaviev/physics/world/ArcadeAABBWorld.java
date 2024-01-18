package ru.kpfu.itis.bagaviev.physics.world;

import ru.kpfu.itis.bagaviev.physics.objects.Body;
import ru.kpfu.itis.bagaviev.physics.objects.DynamicBody;
import ru.kpfu.itis.bagaviev.physics.world.layer.BodyLayer;

import java.util.LinkedList;
import java.util.List;

public class ArcadeAABBWorld extends IterativelyIntegratingWorld {

    //All game objects list
    private final List<BodyLayer> layerList;

    private void updateBody(Body body) {
        if (body instanceof DynamicBody dynamicBody) {

        }
    }

    public ArcadeAABBWorld(int fps) {
        super(fps);

        this.layerList = new LinkedList<>();
    }

    @Override
    public void update() {
        for (BodyLayer layer : layerList) {
            List<Body> bodies = layer.getAllObjects();
            for (Body body : bodies) {

            }
        }
    }

}
