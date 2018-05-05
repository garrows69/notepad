package com.max.JFRAME.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame implements ActionListener {

    private JMenuItem newFile;
    private JMenuItem openFile;
    private JMenuItem closeFile;
    private JMenuItem saveFile;
    private JMenuItem saveAsFile;
    private JMenuItem turnStringLow;
    private JMenuItem turnStringUp;
    private JTextArea area;

    public Frame() {
        newFile = new JMenuItem("New");
        openFile = new JMenuItem("Open") ;
        closeFile = new JMenuItem("Close");
        saveFile = new JMenuItem("Save");
        saveAsFile = new JMenuItem("Save As");
        turnStringLow = new JMenuItem("turn string low");
        turnStringUp = new JMenuItem("TURN STRING UPPER");
        area = new JTextArea("",30,50);
    }


    public void showFrame() {
        //frame properties
        JFrame frame = new JFrame("Notepad");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JMenu for File
        JMenu fileMenu = new JMenu("File");
        fileMenu.addMenuListener(new SampleMenuListener());

        //adds actionListeners to all private instance
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        closeFile.addActionListener(this);
        saveFile.addActionListener(this);
        saveAsFile.addActionListener(this);

        //adds to fileMenu JMenu
        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(closeFile);
        fileMenu.add(saveFile);
        fileMenu.add(saveAsFile);

        //JMenu for edit
        JMenu editMenu = new JMenu("Edit");
        editMenu.addMenuListener(new SampleMenuListener());

        //adds actionListener to all these private instance
        turnStringLow.addActionListener(this);
        turnStringUp.addActionListener(this);

        //adds them to editMenu JMenu
        editMenu.add(turnStringLow);
        editMenu.add(turnStringUp);

        //This is text area in a common notepad
        area.setLineWrap(true);
        area.setWrapStyleWord(true);

        //JMenuBar
        JMenuBar menu = new JMenuBar();
        menu.setOpaque(true);
        menu.setBackground(new Color(209, 228, 179));
        menu.setPreferredSize(new Dimension(200,25));
        menu.add(fileMenu);
        menu.add(editMenu);

        //sets menu and label
        frame.setJMenuBar(menu);
        frame.getContentPane().add(area);

        //displays window
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == newFile){
            System.out.println("newFile was pressed");
            NewFile newF = new NewFile(area);
            newF.close();

        }
        else if(e.getSource() == openFile){
            System.out.println("openFile was pressed");
            OpenFile open = new OpenFile(area);
            open.readText();
        }
        else if(e.getSource() == closeFile){
            System.out.println("closeFile was pressed");
            CloseFile close = new CloseFile(area);
            close.close();
        }
        else if(e.getSource() == saveFile){
            System.out.println("saveFile was pressed");
            SaveFrame save = new SaveFrame(area);
            save.showSFrame();
        }
        else if(e.getSource() == saveAsFile){
            System.out.println("saveAsFile was pressed");
            SaveAsFile saveA = new SaveAsFile(area);
            saveA.showFrame();
        }
        else if(e.getSource() == turnStringLow){

            System.out.println("turnStringLow was pressed");
            String text = area.getText();
            TurnStringLow low = new TurnStringLow(area);
            low.turnCase(text);
        }
        else if(e.getSource() == turnStringUp){
            System.out.println("turnStringUp was pressed");
            String text = area.getText();
            TurnStringUp up = new TurnStringUp(area);
            up.turnCase(text);
        }

    }
}
