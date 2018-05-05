package com.max.JFRAME.src;

import javax.swing.*;

public class TurnStringUp extends TurnStringLow {

    public TurnStringUp(JTextArea j){
        super(j);
    }

    public void turnCase(String jText){

        text.setText(jText.toUpperCase());

    }
}
