package com.max.JFRAME.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseFile implements ActionListener {

    private JTextArea JText;
    private JButton button;
    private JLabel label;
    private JFrame frame;

    public CloseFile(JTextArea j ,String jLabel){
        JText = j;
        label = new JLabel(jLabel);
        button = new JButton("Text File was created");
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,300));
    }

    public CloseFile(JTextArea t){
        JText = t;
        button = new JButton("OK");
        label = new JLabel("Text File was closed and text was cleared");
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,300));
    }

    public void close(){

        //button properties
        button.addActionListener(this);

        //adds the button and label to JFrame
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.getContentPane().add(button, BorderLayout.SOUTH);

        //sets frame to visible
        frame.pack();
        frame.setVisible(true);
        JText.setText(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        frame.dispose();
    }
}
