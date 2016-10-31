package jogl;

import com.jogamp.opengl.util.FPSAnimator;
import jogl.listeners.InputListener;
import jogl.listeners.JoglEventListener;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final String FRAME_TITLE = "Comp graphics. Kutoviy Olexandr DA-31";

    public static void main(String[] args) {
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        //create all needed listeners
        JoglEventListener joglEventListener = new JoglEventListener();
        InputListener inputListener = new InputListener();
        //add all needed listeners
        glcanvas.addGLEventListener(joglEventListener);
        glcanvas.addKeyListener(inputListener);
        glcanvas.setSize(WIDTH, HEIGHT);
        //creating frame
        final JFrame frame = new JFrame(FRAME_TITLE);
        //adding canvas to frame
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
        //Instantiating and Initiating Animator
        final FPSAnimator animator = new FPSAnimator(glcanvas, 300, true);
        animator.start();
    }
}