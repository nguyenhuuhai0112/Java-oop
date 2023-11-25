package chapter4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelctionApp extends JFrame {
    private JLabel colorLabel;

    public ColorSelctionApp() {
        super("Color Selection App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Danh sách 7 màu
        String[] colors = { "Đỏ", "Cam", "Vàng", "Xanh lá", "Xanh dương", "Chàm", "Tím" };

        // ComboBox chứa danh sách màu
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        add(colorComboBox);

        // Label hiển thị màu đã chọn
        colorLabel = new JLabel("Màu đã chọn");
        add(colorLabel);

        // Xử lý sự kiện khi người dùng chọn một màu từ danh sách
        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorComboBox.getSelectedItem();
                changeColor(selectedColor);
            }
        });
    }

    // Phương thức thay đổi màu giao diện
    private void changeColor(String color) {
        Color selectedColor;
        switch (color) {
            case "Đỏ":
                selectedColor = Color.RED;
                break;
            case "Cam":
                selectedColor = Color.ORANGE;
                break;
            case "Vàng":
                selectedColor = Color.YELLOW;
                break;
            case "Xanh lá":
                selectedColor = Color.GREEN;
                break;
            case "Xanh dương":
                selectedColor = Color.BLUE;
                break;
            case "Chàm":
                selectedColor = Color.MAGENTA;
                break;
            case "Tím":
                selectedColor = Color.MAGENTA;
                break;
            default:
                selectedColor = Color.BLACK;
                break;
        }

        getContentPane().setBackground(selectedColor);
        colorLabel.setText("Màu đã chọn: " + color);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ColorSelctionApp().setVisible(true);
            }
        });
    }
}
