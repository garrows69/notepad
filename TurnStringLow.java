package com.max.JFRAME.src;

import javax.swing.*;

public class TurnStringLow {

    private JTextArea text;

    public TurnStringLow(JTextArea j){
        text = j;
    }

    public void turnLow(String jText){

        text.setText(jText.toLowerCase());

    }
}
