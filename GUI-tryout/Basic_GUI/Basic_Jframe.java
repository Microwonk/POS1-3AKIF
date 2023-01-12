import java.awt.Color;
import java.io.IOException;
import javax.swing.JFrame;
import java.util.Random;

public class Basic_Jframe {

    public Basic_Jframe() {

    }

    public static void main(String[] args) throws IOException {
        /*
        // Jframe not inside of an Object

        JFrame window = new JFrame();
        window.setTitle("my JFrame");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(420, 420);
        window.setVisible(true);
        window.getContentPane().setBackground(new Color(0x1234567));
        */
        
        for (int i = 0; i < 100; i++) {
            MyFrame f =new MyFrame(new Random().nextInt(0, 256), new Random().nextInt(0, 256), new Random().nextInt(0, 256));
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            f.dispose();
        }
        
    }
}