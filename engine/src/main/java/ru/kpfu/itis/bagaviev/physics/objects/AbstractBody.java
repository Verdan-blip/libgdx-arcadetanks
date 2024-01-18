package ru.kpfu.itis.bagaviev.physics.objects;

import ru.kpfu.itis.bagaviev.physics.shapes.Shape;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.MassData;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Material;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Transform;
import ru.kpfu.itis.bagaviev.physics.structs.mutable.Vector2;

public abstract class AbstractBody implements Body {

    //Body structure
    protected final Transform transform;
    protected final Material material;
    protected Shape shape;

    //Variables
    protected Vector2 shapeCentroid;

    public AbstractBody(Transform transform, Material material, Shape shape) {
        this.transform = transform;
        this.material = material;
        this.shape = shape;

        this.shapeCentroid = new Vector2();
    }

    public void setPosition(float x, float y) {
        transform.setCenter(x, y);
    }

    public void setAngle(float angle) {
        transform.setAngle(angle);
    }

    abstract void computeMassData(MassData outMassData);

    @Override
    public void computeTransform(Transform outTransform) {
        outTransform.setCenter(transform.getCenterX(), transform.getCenterY());
        outTransform.setAngle(transform.getAngle());
    }

    @Override
    public void computeMaterial(Material outMaterial) {
        outMaterial.setDensity(material.getDensity());
        outMaterial.setFriction(material.getFriction());
        outMaterial.setRestitution(material.getRestitution());
    }

    @Override
    public Shape getShape() {
        return shape;
    }

    public void setTransform(Transform transform) {
        this.transform.setCenter(transform.getCenterX(), transform.getCenterY());
        this.transform.setAngle(transform.getAngle());
    }

    public void setMaterial(Material material) {
        this.material.setDensity(material.getDensity());
        this.material.setRestitution(material.getRestitution());
        this.material.setFriction(material.getFriction());
    }

    public float getPositionX() {
        return transform.getCenterX();
    }

    public float getPositionY() {
        return transform.getCenterY();
    }

    public float getAngle() {
        return transform.getAngle();
    }

}
