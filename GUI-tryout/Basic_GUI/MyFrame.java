import java.awt.Color;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

    public MyFrame(int r, int g, int b) {
        // all the most important methods inside of the JFrame class
        this.setTitle("Cool Title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1920, 1080);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(r, g, b));
    }

}