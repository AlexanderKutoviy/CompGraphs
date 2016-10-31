package jogl.listeners;

import jogl.objects.Bias;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputListener implements KeyListener {

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'a') {
            Bias.x -= 0.05f;
        }
        if (e.getKeyChar() == 'd') {
            Bias.x += 0.05f;
        }
        if (e.getKeyChar() == 's') {
            Bias.y -= 0.05f;
        }
        if (e.getKeyChar() == 'w') {
            Bias.y += 0.05f;
        }
    }

    public void keyReleased(KeyEvent e) {
    }
}