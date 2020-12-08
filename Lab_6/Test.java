package Lab_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame {
    public static void main(String arg[]){

        JFrame frame = new JFrame("Game");
        frame.setSize(1000,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        JTextField jta = new JTextField(2);
        JButton button = new JButton("OK");
        frame.add(jta,BorderLayout.CENTER);
        frame.add(button,BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            int count = 0;
            public void actionPerformed(ActionEvent ae){
                if(jta.getText().equals("20")){
                    JOptionPane.showMessageDialog(null, "YES");
                    System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO");
                    count++;
                    if(count == 3) System.exit(0);
                }
            }
        });

    }
}
