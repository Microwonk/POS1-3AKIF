import javax.swing.*;
import java.awt.Color;

public class Basic_Labels {
    public Basic_Labels() {
        
    }

    public static void main(String[] args) {
        
        // ein JLabel ist ein Content innerhalb von einem JFrame, consisting of bild, text, oder beidem

        JLabel label = new JLabel(); // create the label
        label.setText("Hallo"); // set the text of the label
        
        JFrame window = new JFrame();
        window.setTitle("Hallo");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(420, 420);
        window.setVisible(true);
        window.getContentPane().setBackground(new Color(255, 255, 255));

        window.add(label); // adding the label to the frame


    }
}
