package com.geekbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
private int value;


    public MyWindow() {
        setBounds(2000,300,400,400);
        setTitle("First Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        Font font = new Font("Arial", Font.BOLD,32);
        JLabel valueViewLabel = new JLabel();
        valueViewLabel.setFont(font);
        valueViewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(valueViewLabel, BorderLayout.CENTER);

        value = 1;
        valueViewLabel.setText(String.valueOf(value));

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                valueViewLabel.setText(String.valueOf(value));
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                valueViewLabel.setText(String.valueOf(value));
            }
        });



        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();

    }
}