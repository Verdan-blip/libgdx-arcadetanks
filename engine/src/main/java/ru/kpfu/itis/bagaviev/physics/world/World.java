package ru.kpfu.itis.bagaviev.physics.world;

import java.util.List;

public interface World {
    void step();
    void update();
    List<? extends WorldLayer> getLayers();
}
