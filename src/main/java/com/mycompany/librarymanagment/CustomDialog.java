package com.mycompany.librarymanagment;

import java.awt.*;
import javax.swing.*;

public class CustomDialog extends JDialog {

    public CustomDialog(JFrame frame, String message, String title) {
        super(frame, title, true);
        getContentPane().setBackground(Color.WHITE);

        JLabel label = new JLabel("<html><span style='font-family: Franklin Gothic Demi; font-size: 10px;'>" + message + "</span></html>");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(BorderFactory.createEmptyBorder(8, 10, 10, 10));

        JButton okButton = new JButton("Ok");
        okButton.addActionListener(e -> dispose());
        okButton.setBackground(new Color(28,130,148));
        okButton.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 12));
        okButton.setForeground(Color.WHITE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);
        panel.add(label, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.add(okButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        add(panel);
        pack();
        setLocationRelativeTo(frame);
        okButton.requestFocus();
      }
}
