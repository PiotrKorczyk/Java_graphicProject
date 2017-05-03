package java_lab_04;

import javax.swing.JComponent;
import java.awt.*;

public class Draw extends JComponent {

    private int [] xP = new int [3];
    private int [] yP = new int [3];
    
    private int numberOfVertices;

//    public void setNumberOfVertices(int numberOfVertices) {
//        this.numberOfVertices = numberOfVertices;
//    }
//
//    public void setxP(int[] xP) {
//        this.xP = xP;
//    }
//
//    public void setyP(int[] yP) {
//        this.yP = yP;
//    }
    

    public void setXPAndYP(int[] _xP, int[] _yP, int _numberOfVertices) {
        this.xP = new int[_numberOfVertices];
         this.yP = new int[_numberOfVertices];
        this.numberOfVertices = _numberOfVertices;
        for (int i = 0; i <= _numberOfVertices - 1; i++) {
            this.xP[i] = _xP[i];
            this.yP[i] = _yP[i];
            System.out.println(xP[i] + "   "+yP[i]);
        }
        System.out.println(numberOfVertices);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for(int i=0;i<=numberOfVertices-1;i++){
            System.out.println(xP[i]+"  "+yP[i]);
        }
        Polygon poly = new Polygon(xP, yP, numberOfVertices);
            g2.drawPolygon(poly);
//        g2.drawPolygon(xP, yP, numberOfVertices);
//        g.drawRect(150,150,200,200);
//        g.drawPolygon(xP, yP, numberOfVertices);
    }
}
    