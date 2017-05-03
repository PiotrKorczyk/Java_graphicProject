package java_lab_04;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

class Main {

    public static void main(String[] args) {

        JFrame myWindow = new JFrame();
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        myWindow.setSize(screenSize.width / 2, screenSize.height / 2);
        myWindow.setResizable(false);
        myWindow.getContentPane().add(new Draw());
        myWindow.setVisible(true);
        Draw draw = new Draw();
        int[] x = {100, 200, 400};
        int[] y = {300, 300, 200};
        
//        draw.setxP(x);
//        draw.setyP(y);
//        draw.setNumberOfVertices(3);

        draw.setXPAndYP(x, y, 3);

        myWindow.add(draw);

    }
}
