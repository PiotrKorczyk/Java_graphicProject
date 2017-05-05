package java_lab_04;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

class Main {

    public static void main(String[] args) {

        int[] x = {100, 200, 400};
        int[] y = {300, 300, 200};

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame myWindow = new JFrame();
                myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                myWindow.setSize(dim.width / 2, dim.height / 2);
                myWindow.setLocation((dim.width/2)/2, (dim.height/2)/2);
                myWindow.setResizable(false);
                myWindow.getContentPane().add(new Draw());
                myWindow.setVisible(true);
                Draw draw = new Draw();
                myWindow.add(draw);
                draw.setXPAndYP(x, y, 3);

            }
        });

//        draw.setxP(x);
//        draw.setyP(y);
//        draw.setNumberOfVertices(3);
    }
}
