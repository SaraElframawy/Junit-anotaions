package org.example;

import javax.swing.*;

public class Cal {
    public int add(int term1, int term2) {
        return term1+term2;
    }

    public double divd(int term1, int term2 ){

        JOptionPane.showMessageDialog(null, "Man får inte dividera med 0 ", "information", JOptionPane.INFORMATION_MESSAGE);

        if (term2 ==0) {
            throw new ArithmeticException("can't divid by zero");


        }int i = term1/term2;
        return i;
}

    public int squ(int tringValue) {
        return (int) Math.pow(tringValue,2);
    }
}
