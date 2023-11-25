package chapter4;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Quiz extends Frame {
    Checkbox chkbook1 = new Checkbox("AnAnCuc", false);
    Checkbox chkbook2 = new Checkbox("AnBuDit", false);
    Checkbox chkbook3 = new Checkbox("AnDauBuoi", false);
    Checkbox chkbook4 = new Checkbox("AnBigAss", false);

    public Quiz(String title) {
        super(title);
        setLayout(new GridBagLayout());
        add(new Label("lop Frame thuoc goi nao?"));
        add(chkbook1);
        add(chkbook2);
        add(chkbook3);
        add(chkbook4);
        addWindowFocusListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent we) {
                setVisible(false);
                System.exit(0);

            }
        });
    }

    public static void main(String[] args) {
        Quiz objQuiz = new Quiz("online Quiz");
        objQuiz.setSize(550, 550);
        objQuiz.setVisible(true);
    }

}
