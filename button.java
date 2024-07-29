import java.awt.*;
import java.awt.event.*;
public class button {
    public static void main(String[] args) {
        Frame frame = new Frame("working with button");
    Button button = new Button("button 1");

    frame.add(button);

    frame.setSize(200,100);
    frame.setLayout(new FlowLayout());
    frame.setVisible(true);
    }

    
    
}
