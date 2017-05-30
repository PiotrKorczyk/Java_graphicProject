package java_lab_04;

import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        Quadrangle[] arrayOfQuadrangles = { 
            new Quadrangle(400, 100, 500, 250, 500, 300, 650,200),
            new Quadrangle(60, 60, 260, 60, 260, 220, 60, 260),
        };
        
        Triangle[] arrayOfTriangles = { 
            new Triangle(400, 300, 400, 200, 150, 150),
            new Triangle(80, 50, 20, 100, 160, 140)
        };
        
        for(int i = 0; i < arrayOfQuadrangles.length; i++) {
            arrayOfQuadrangles[i].drawFigure(g);
        }
        
        for(int i = 0; i < arrayOfTriangles.length; i++) {
            arrayOfTriangles[i].drawFigure(g); 
            

        }

    }
}
