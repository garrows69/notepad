package com.max.JFRAME.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveAsFile implements ActionListener {

    private JFrame frame;
    private JLabel label;
    private JButton button;
    private JTextArea jText;
    private String text;
    private JTextArea note;

    public SaveAsFile(JTextArea notePad){
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 300));
        label = new JLabel("Input the name you want the file saved as");
        button = new JButton("Ok");
        jText = new JTextArea();
        note = notePad;
    }

    public void showFrame(){
        button.addActionListener(this);
        //adds button and JLabel
        frame.getContentPane().add(label, BorderLayout.NORTH);
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        frame.getContentPane().add(jText, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text = jText.getText();
        File textFile = new File(text + ".txt");
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(textFile));
            try{
                out.write(note.getText());
            } finally {
                out.close();
            }
        } catch (IOException r) {
            r.printStackTrace();
        }
        frame.setVisible(false);
        frame.dispose();
    }
}
