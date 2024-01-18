package ru.kpfu.itis.bagaviev.physics.world.layer;

import ru.kpfu.itis.bagaviev.physics.objects.Body;
import ru.kpfu.itis.bagaviev.physics.objects.DynamicBody;
import ru.kpfu.itis.bagaviev.physics.objects.StaticBody;

import java.util.ArrayList;
import java.util.List;

public class BodyLayer {

    private final List<Body> bodyList;

    public BodyLayer() {
        bodyList = new ArrayList<>();
    }

    public void addBody(Body body) {
        bodyList.add(body);
    }

    public void removeBody(int index) {
        bodyList.remove(index);
    }

    public List<Body> getAllObjects() {
        return bodyList;
    }

}
