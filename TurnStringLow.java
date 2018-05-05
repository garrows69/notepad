package com.max.JFRAME.src;

import javax.swing.*;

public class TurnStringLow {

    protected JTextArea text;

    public TurnStringLow(JTextArea j){
        text = j;
    }

    public void turnCase(String jText){

        text.setText(jText.toLowerCase());

    }
}
