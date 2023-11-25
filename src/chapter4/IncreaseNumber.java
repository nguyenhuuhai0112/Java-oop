package chapter4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncreaseNumber {
    private static int counter = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BigDick");
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(10);
        textField.setText("1");
        JButton button = new JButton("LenChoTao");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                textField.setText(String.valueOf(counter));
            }
        });

        panel.add(textField);
        panel.add(button);
        frame.add(panel);
        frame.setSize(5000, 6000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
