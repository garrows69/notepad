package com.max.JFRAME.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFrame implements ActionListener {

    private JFrame frame;
    private JTextArea Jtext;

    public SaveFrame(JTextArea t){
        Jtext = t;
    }

   public void showSFrame(){
       //creates JFrame
       frame = new JFrame();
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.setPreferredSize(new Dimension(300,300));
       frame.setResizable(false);

       //button
       JButton button = new JButton("OK");
       button.setPreferredSize(new Dimension(100,100));
       button.addActionListener(this);

       //label
       JLabel text = new JLabel("The file was saved/It was saved in home directory. Ex: C:\\Users\\Yourname");
       text.setPreferredSize(new Dimension(200,200));

       //Saves file to User Home Directory
       String userHome = System.getProperty("user.home");
       File textFile = new File(userHome, "myText.txt");
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
