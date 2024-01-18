package ru.kpfu.itis.bagaviev.test;

import ru.kpfu.itis.bagaviev.physics.shapes.CircleShape;
import ru.kpfu.itis.bagaviev.physics.shapes.Shape;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Transform;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ShapeDrawer {

    private final Ellipse2D ellipse;

    public ShapeDrawer() {
        ellipse = new Ellipse2D.Float();
    }

    public void draw(Graphics2D graphics, Shape shape, Transform transform) {
        switch (shape.getShapeType()) {
            case CIRCLE -> {
                CircleShape circleShape = (CircleShape) shape;
                ellipse.setFrame(
                        transform.getCenterX(), transform.getCenterY(),
                        circleShape.getRadius(), circleShape.getRadius()
                );
                graphics.draw(ellipse);
            }
        }
    }

}
