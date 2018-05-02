package com.max.JFRAME.src;

import javax.smartcardio.Card;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class saveFrame implements ActionListener {

    private JFrame frame;

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
       JLabel text = new JLabel("The file was saved");
       text.setPreferredSize(new Dimension(200,200));

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
