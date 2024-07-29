import java.awt.*;
import java.awt.event.*;

public class SimplePanelExample {
    public static void main(String[] args) {
       Frame frame = new Frame();
       Dialog dialog = new Dialog(frame,"dialog", true);

       Label label = new Label("this is my first dialog");
       dialog.add(label);
       dialog.setSize(200,100);
       dialog.setLayout(new FlowLayout());
       

       frame.setSize(300,200);
       frame.setVisible(true);
       dialog.setVisible(true);
    }
}
