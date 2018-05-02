package com.max.JFRAME.src;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OpenFile {

    JTextArea JText;

    public OpenFile(JTextArea j){
        JText = j;
    }

    public void readText(){

        try{
            FileReader read = new FileReader("myText.txt");
            BufferedReader reader = new BufferedReader(read);
            JText.read(reader, "myText.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
