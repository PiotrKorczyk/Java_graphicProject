package java_lab_04;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.*;

class Main {

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MyJFrame frame = new MyJFrame();
            }
        });
    }
}



