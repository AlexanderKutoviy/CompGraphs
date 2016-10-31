package jogl.listeners;

import jogl.objects.Rotation;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputListener implements KeyListener {

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
//        if (e.getKeyChar() == 'a') {
//            Bias.x -= 0.05f;
//        }
//        if (e.getKeyChar() == 'd') {
//            Bias.x += 0.05f;
//        }
//        if (e.getKeyChar() == 's') {
//            Bias.y -= 0.05f;
//        }
//        if (e.getKeyChar() == 'w') {
//            Bias.y += 0.05f;
//        }
        if(e.getKeyChar() == 'w'){
            Rotation.angleY +=0.5;
        }
        if(e.getKeyChar() == 's'){
            Rotation.angleY -=0.5;
        }
        if(e.getKeyChar() == 'a'){
            Rotation.angleX -=0.5;
        }
        if(e.getKeyChar() == 'd'){
            Rotation.angleX +=0.5;
        }
    }

    public void keyReleased(KeyEvent e) {
    }
}