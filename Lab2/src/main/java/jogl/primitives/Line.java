package jogl.primitives;

import jogl.objects.Point3D;

import javax.media.opengl.GL2;

public class Line {

    private Point3D startPoint3D;
    private Point3D endPoint3D;
    private float[] color = new float[3];

    public Line(Point3D startPoint3D, Point3D endPoint3D) {
        this.startPoint3D = startPoint3D;
        this.endPoint3D = endPoint3D;
    }

    public Line(Point3D startPoint3D, Point3D endPoint3D, float[] color) {
        this.startPoint3D = startPoint3D;
        this.endPoint3D = endPoint3D;
        setColor(color[0], color[1], color[2]);
    }

    public void setColor(float r, float g, float b) {
        color[0] = r;
        color[1] = g;
        color[2] = b;
    }

    public void drawLine(GL2 gl) {
        gl.glColor3f(color[0], color[1], color[2]);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(startPoint3D.x, startPoint3D.y, startPoint3D.z);
        gl.glVertex3f(endPoint3D.x, endPoint3D.y, endPoint3D.z);
        gl.glEnd();
    }
}