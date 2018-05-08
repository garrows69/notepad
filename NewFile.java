package com.max.JFRAME.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class NewFile implements ActionListener {

    private JFrame frame;
    private JLabel label;
    private JButton button;
    private JTextArea area;

    public NewFile(JTextArea area){
        frame = new JFrame("New File");
        frame.setPreferredSize(new Dimension(300,300));
        label = new JLabel("New File was created(named NewFile)");
        button = new JButton("OK");
        button.addActionListener(this);
        this.area = area;
    }

    public void showFrame(){

        frame.getContentPane().add(label, BorderLayout.NORTH);
        frame.getContentPane().add(button, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        area.setText("");
        File newText = new File("NewFile.txt");
        frame.setVisible(false);
        frame.dispose();
    }
}
