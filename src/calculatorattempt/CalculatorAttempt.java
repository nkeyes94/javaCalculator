/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorattempt;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Nates Rig
 */
public class CalculatorAttempt 
{
    
    public static void main(String[] args) 
    {
        Calc testCalc = new Calc();
        testCalc.setVisible(true);
        testCalc.setSize(400, 135);
        testCalc.setBackground(Color.LIGHT_GRAY);
        testCalc.setForeground(Color.lightGray);
        testCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
