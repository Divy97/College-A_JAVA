import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;

class WinClose extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        JFrame fb = new JFrame();
        WinClose wc = new WinClose();

        fb.addWindowListener(wc);
        fb.setTitle("hey");
        fb.setSize(600, 400);
        fb.setVisible(true);
        fb.setLocation(200, 400);
    }
}