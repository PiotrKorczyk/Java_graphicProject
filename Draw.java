package java_lab_04;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Draw extends JPanel {


    public void paintComponent(Graphics g) {

        ArrayList<Polygon> list = new ArrayList<Polygon>(4); 

        list.add(new Quadrangle(400, 100, 500, 250, 500, 300, 650, 200));
        list.add(new Quadrangle(60, 60, 260, 60, 260, 220, 60, 260));
        list.add(new Triangle(400, 300, 400, 200, 150, 150)); 
        list.add(new Triangle(80, 50, 20, 100, 160, 140));

        System.out.println("List of polygons\n");

        for (int i = 0; i < list.size(); i++) {
            list.get(i).drawFigure(g);
            System.out.println(list.get(i));
            
        }

     
    }
}

