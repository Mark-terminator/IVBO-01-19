package Lab_5_;
import java.awt.*;
import javax.swing.*;
public class Frame {
    public Frame (String arg) {
        JFrame frame = new JFrame ("Label Demonstration");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon
                (arg);
        JLabel label1;
        label1 = new JLabel ("", icon,
                SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.setBackground (Color.white);
        panel.setPreferredSize (new Dimension (300, 350));
        panel.add (label1);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
