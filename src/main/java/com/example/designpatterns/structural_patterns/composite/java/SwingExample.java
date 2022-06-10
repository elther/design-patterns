package com.example.designpatterns.structural_patterns.composite.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JTextField jTextField = new JTextField();
        jTextField.setBounds(200,200,200,40);
        frame.add(jTextField);

        JButton button = new JButton("click");
        button.setBounds(200,100,60,40);
        button.addActionListener(e -> jTextField.setText("hello swing"));

        frame.add(button);

        frame.setSize(600,400);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
