package ru.kpfu.itis.bagaviev.test;

import ru.kpfu.itis.bagaviev.physics.objects.Body;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Transform;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class RendererComponent extends JComponent {

    private final List<Body> bodies;

    private final ShapeDrawer drawer;

    private final Transform transformBuffer;

    public RendererComponent() {
        bodies = new LinkedList<>();

        drawer = new ShapeDrawer();

        transformBuffer = new Transform();
    }

    public void add(Body object) {
        bodies.add(object);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;

        for (Body body : bodies) {
            body.computeTransform(transformBuffer);
            drawer.draw(graphics2D, body.getShape(), transformBuffer);
        }
    }

}
