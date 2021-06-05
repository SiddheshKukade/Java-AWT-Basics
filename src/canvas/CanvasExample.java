package canvas;
import java.awt.*;
import java.awt.event.*;
public class CanvasExample {
    CanvasExample(){
        Frame f= new Frame("Canvas Example");
        f.add(new MyCanvas());
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CanvasExample();
    }
}
class MyCanvas extends  Canvas {
    MyCanvas(){
        setBackground(Color.gray);
        setSize(300,300);
    }
    @Override
    public void paint(Graphics g) {
       g.setColor(Color.yellow);
        g.fillOval(75,75,156 , 75);
    }
}