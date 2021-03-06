package com.max.JFRAME.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFrame implements ActionListener{

    private JFrame frame;
    private JTextArea Jtext;
    private JButton button;

    public SaveFrame(JTextArea t){
        Jtext = t;
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,300));
        button = new JButton("Ok");
    }

   public void showSFrame(){
       //button
       button.setPreferredSize(new Dimension(100,100));
       button.addActionListener(this);

       //label
       JLabel text = new JLabel("The file was saved/It was saved where the project is located.");
       text.setPreferredSize(new Dimension(200,200));

       //Saves file to User Home Directory
       File textFile = new File("NewFile.txt");
       try {
           BufferedWriter out = new BufferedWriter(new FileWriter(textFile));
           try{
               out.write(Jtext.getText());
           } finally {
               out.close();
           }
       } catch (IOException e) {
           e.printStackTrace();
       }


       //adds content to JFrame
       frame.getContentPane().add(text, BorderLayout.NORTH);
       frame.getContentPane().add(button, BorderLayout.CENTER);

       //sets frame to visible
       frame.pack();
       frame.setVisible(true);
   }

   public void actionPerformed(ActionEvent e){
       frame.setVisible(false);
       frame.dispose();
   }
}
