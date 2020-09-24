package Prac_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Pr_4 extends JFrame {
    private int countForMilan = 0, countForMadrid = 0;
    private JButton b1 = new JButton( "AC Milan");

    private JButton b2 = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: 0 x 0");
    private JLabel lastScorer = new JLabel("Last Scorer: N/A");
    private JLabel winner = new JLabel("Winner: DRAW");


    Pr_4() {
        super("Practice 4");
        setSize(300, 300);
        setLayout(new GridLayout(4,1));
        add(b1);
        add(b2);
        add(result);
        add(lastScorer);
        add(winner);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                countForMilan++;
                result.setText("Result: " + countForMilan + " X " + countForMadrid);
                lastScorer.setText("Last Scorer: AC Milan");
                if(countForMilan > countForMadrid) winner.setText("Winner: AC Milan");
                else if(countForMadrid == countForMilan) winner.setText("Winner: DRAW");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                countForMadrid++;
                result.setText("Result: " + countForMilan + " X " + countForMadrid);
                lastScorer.setText("Last Scorer: Real Madrid");
                if(countForMadrid > countForMilan) winner.setText("Winner: Real Madrid");
                else if(countForMilan == countForMadrid) winner.setText("Winner: DRAW");
            }
        });
    }
    public static void main(String arg[]){
        new Pr_4().setVisible(true);
    }
}
