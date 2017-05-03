package java_lab_04;
import java.awt.Graphics;

class Main{

   
public static void main(String [] args){
    int [] x ={100,200,400};
    int [] y ={300,300,500}; 
    SetWindow win = new SetWindow();
    Draw draw = new Draw();
  
    draw.setXPAndYP( x, y, 3);
    draw.paint(Graphics g);
}
}