package ru.kpfu.itis.bagaviev.test;

import ru.kpfu.itis.bagaviev.physics.objects.Body;

import javax.swing.*;
import java.awt.event.KeyListener;

public class SwingWindow {

    private final JFrame frame;
    private final RendererComponent rendererComponent;

    public SwingWindow(String title, int width, int height) {
        rendererComponent = new RendererComponent();

        frame = new JFrame(title);
        frame.setContentPane(rendererComponent);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void setKeyListener(KeyListener listener) {
        frame.addKeyListener(listener);
    }

    public void removeKeyListener(KeyListener listener) {
        frame.removeKeyListener(listener);
    }

    public void add(Body object) {
        rendererComponent.add(object);
    }

    public void repaint() {
        rendererComponent.repaint();
    }

}
