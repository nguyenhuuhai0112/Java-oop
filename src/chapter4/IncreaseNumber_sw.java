package chapter4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class IncreaseNumber_sw extends JFrame implements ActionListener {
    JButton bt;
    JTextField tf;
    int counter = 0;

    public IncreaseNumber_sw() {
        bt = new JButton("tang");
        bt.addActionListener(this);
        tf = new JTextField("0");
        Container cont = this.getContentPane();
        cont.setLayout(new FlowLayout());
        cont.add(bt);
        cont.add(tf);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        counter++;
        tf.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new IncreaseNumber_sw();
    }
}
