package java_lab_04;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class SetWindow {
    
    public SetWindow() {
        
        JFrame myWindow = new JFrame();
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        myWindow.setSize(screenSize.width/2, screenSize.height/2);
        myWindow.setResizable(false);
        myWindow.getContentPane().add(new Draw());
        myWindow.setVisible(true);
    }
    
}
