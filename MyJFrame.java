package java_lab_04;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class MyJFrame {

    public MyJFrame() {
        JFrame frame = new JFrame("Let's draw!");
        Draw draw = new Draw();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dim.width / 2, dim.height / 2);
        frame.setLocation((dim.width / 2) / 2, (dim.height / 2) / 2);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(draw);

    }

}
