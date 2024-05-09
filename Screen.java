package praticas.java.dashboard;


import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {
    public Screen() {
        setTitle("Dashboard");
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JButton jButton = new JButton();
        jButton.setText("BAKER");
        jButton.setBounds(200, 100, 150, 100);
        jButton.setFont(new Font("Arial", Font.BOLD, 20));
        jButton.setForeground(new Color(255, 255, 255, 255));
        jButton.setBackground(new Color(11, 11, 11));

        add(jButton);

        jButton.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "best part of skate: BAKER 3 on Youtube!", "my fav part",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
