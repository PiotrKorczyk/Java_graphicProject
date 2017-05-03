package java_lab_04;

import javax.swing.JComponent;
import java.awt.Graphics;

public class Draw extends JComponent {

    private int[] xP;
    private int[] yP;
    private int numberOfVertices;

    public void setXPAndYP(int[] _xP, int[] _yP, int _numberOfVertices) {
        this.xP = new int[_numberOfVertices];
        this.yP = new int[_numberOfVertices];
        this.numberOfVertices = _numberOfVertices;
        for (int i = 0; i <= _numberOfVertices - 1; i++) {
            xP[i] = _xP[i];
            yP[i] = _yP[i];
            System.out.println(xP[i] + "   "+yP[i]);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.drawRect(150,150,200,200);
        g.drawPolygon(xP, yP, numberOfVertices);
    }
}
    