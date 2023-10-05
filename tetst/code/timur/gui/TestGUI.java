package timur.gui;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

public class TestGUI {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        FlowLayout fl = new FlowLayout();
        frame.setLayout(fl);

        JButton button = new JButton("Test Button");
        button.setSize(300,200);

        JPanel panel = new JPanel(fl);
        panel.setBorder(BorderFactory.createEtchedBorder());
        panel.setSize(300,300);
        panel.add(button);

        frame.getContentPane().add(panel);

    }
}
