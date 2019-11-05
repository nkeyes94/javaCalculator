/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorattempt;
import java.util.*;                                                             //Importing our java utilities for scanners.
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Nates Rig
 */
public class Calc extends JFrame
{
    private int valOne;
    private int valTwo;
    
    //Number Buttons
    private final JButton one;
    private final JButton two;
    private final JButton three;
    private final JButton four;
    private final JButton five;
    private final JButton six;
    private final JButton seven;
    private final JButton eight;
    private final JButton nine;
    private final JButton zero;
    
    //Operator buttons
    private final JButton add;
    private final JButton sub;
    private final JButton mult;
    private final JButton div;
    private final JButton equal;
    private final JButton clear;
    private final JButton memOne;
    private final JButton memOneRec;
    private final JButton exp;
    
    //Text fields
    private final JTextField field1; 
     
    public Calc()
    {
        super("Calculator");
        setLayout(new FlowLayout());
        
        handler handle = new handler();
        operator operate = new operator();
        
        one = new JButton("1");
        one.addActionListener(handle);
        one.setFocusable(false);
        one.setForeground(Color.WHITE);
        one.setBackground(Color.gray);
        
        two = new JButton("2");
        two.addActionListener(handle);
        two.setFocusable(false);
        two.setForeground(Color.white);
        two.setBackground(Color.gray);
        
        three = new JButton("3");
        three.addActionListener(handle);
        three.setFocusable(false);
        three.setForeground(Color.white);
        three.setBackground(Color.gray);
        
        four = new JButton("4");
        four.addActionListener(handle);
        four.setFocusable(false);
        four.setForeground(Color.white);
        four.setBackground(Color.gray);
        
        five = new JButton("5");
        five.addActionListener(handle);
        five.setFocusable(false);
        five.setForeground(Color.white);
        five.setBackground(Color.gray);
        
        six = new JButton("6");
        six.addActionListener(handle);
        six.setFocusable(false);
        six.setForeground(Color.white);
        six.setBackground(Color.gray);
        
        seven = new JButton("7");
        seven.addActionListener(handle);
        seven.setFocusable(false);
        seven.setForeground(Color.white);
        seven.setBackground(Color.gray);
        
        eight = new JButton("8");
        eight.addActionListener(handle);
        eight.setFocusable(false);
        eight.setForeground(Color.white);
        eight.setBackground(Color.gray);
        
        nine = new JButton("9");
        nine.addActionListener(handle);
        nine.setFocusable(false);
        nine.setForeground(Color.white);
        nine.setBackground(Color.gray);
        
        zero = new JButton("0");
        zero.addActionListener(handle);
        zero.setFocusable(false);
        zero.setForeground(Color.white);
        zero.setBackground(Color.gray);
        
        add = new JButton("+");
        add.addActionListener(operate);
        add.setFocusable(false);
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        
        sub = new JButton("-");
        sub.addActionListener(operate);
        sub.setFocusable(false);
        sub.setForeground(Color.white);
        sub.setBackground(Color.black);
        
        mult = new JButton("*");
        mult.addActionListener(operate);
        mult.setFocusable(false);
        mult.setForeground(Color.white);
        mult.setBackground(Color.black);
        
        div = new JButton("/");
        div.addActionListener(operate);
        div.setFocusable(false);
        div.setForeground(Color.white);
        div.setBackground(Color.black);
        
        equal = new JButton("=");
        equal.addActionListener(operate);
        equal.setFocusable(false);
        equal.setForeground(Color.white);
        equal.setBackground(Color.black);
        
        clear = new JButton("CLR");
        clear.addActionListener(operate);
        clear.setFocusable(false);
        clear.setForeground(Color.white);
        clear.setBackground(Color.black);
        
        memOne = new JButton("M1");
        memOne.addActionListener(operate);
        memOne.setFocusable(false);
        memOne.setForeground(Color.white);
        memOne.setBackground(Color.black);
        
        memOneRec = new JButton("M1R");
        memOneRec.addActionListener(operate);
        memOneRec.setFocusable(false);
        memOneRec.setForeground(Color.white);
        memOneRec.setBackground(Color.black);
        
        exp = new JButton("^");
        exp.addActionListener(operate);
        exp.setFocusable(false);
        exp.setForeground(Color.white);
        exp.setBackground(Color.black);
        
        field1 = new JTextField(10);
        
        add(field1);
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(zero);
        add(add);
        add(sub);
        add(mult);
        add(div);
        add(exp);
        add(equal);
        add(clear);
        add(memOne);
        add(memOneRec);
    }
    
    private class handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int valueOne = Integer.parseInt(one.getText().trim());
            int valueTwo = Integer.parseInt(two.getText().trim());
            int valueThree = Integer.parseInt(three.getText().trim());
            int valueFour = Integer.parseInt(four.getText().trim());
            int valueFive = Integer.parseInt(five.getText().trim());
            int valueSix = Integer.parseInt(six.getText().trim());
            int valueSeven = Integer.parseInt(seven.getText().trim());
            int valueEight = Integer.parseInt(eight.getText().trim());
            int valueNine = Integer.parseInt(nine.getText().trim()); 
            int valueZero = Integer.parseInt(zero.getText().trim());
            
            if(e.getSource()==one)
            {
                System.out.println("1 selected");
                field1.setText(field1.getText() + valueOne);
            }
            else if(e.getSource()==two)
            {
                System.out.println("2 selected");
                field1.setText(field1.getText() + valueTwo);
            }
            else if(e.getSource()==three)
            {
                System.out.println("3 selected");
                field1.setText(field1.getText() + valueThree);
            }
            else if(e.getSource()==four)
            {
                System.out.println("4 selected");
                field1.setText(field1.getText() + valueFour);
            }
            else if(e.getSource()==five)
            {
                System.out.println("5 selected");
                field1.setText(field1.getText() + valueFive);
            }
            else if(e.getSource()==six)
            {
                System.out.println("6 selected");
                field1.setText(field1.getText() + valueSix);
            }
            else if(e.getSource()==seven)
            {
                System.out.println("7 selected");
                field1.setText(field1.getText() + valueSeven);
            }
            else if(e.getSource()==eight)
            {
                System.out.println("8 selected");
                field1.setText(field1.getText() + valueEight);
            }
            else if(e.getSource()==nine)
            {
                System.out.println("9 selected");
                field1.setText(field1.getText()+ valueNine);
            }
            else if(e.getSource()==zero)
            {
                field1.setText(field1.getText() + valueZero);
            }
        }
    }
    
    private class operator implements ActionListener
    {
        int answer;
        int memRec;
        public void actionPerformed(ActionEvent e)
        {
            String addSymbol = "+";
            String subSymbol = "-";
            String multSymbol = "*";
            String divSymbol = "/";
            String expSymbol = "^";
            
            if(e.getSource()==add)
            {
                System.out.println("+");
                valOne = Integer.parseInt(field1.getText());
                field1.setText(field1.getText().trim() + addSymbol);
                System.out.println("First value: "+ valOne);
            }
            
            if(e.getSource()==sub)
            {
                System.out.println("-");
                valOne = Integer.parseInt(field1.getText());
                field1.setText(field1.getText().trim() + subSymbol);
                System.out.println("First value: "+ valOne);
            }
            
            if(e.getSource()==mult)
            {
                System.out.println("*");
                valOne = Integer.parseInt(field1.getText());
                field1.setText(field1.getText().trim() + multSymbol);
                System.out.println("First value: "+ valOne);
            }
            if(e.getSource()==div)
            {
                System.out.println("/");
                valOne = Integer.parseInt(field1.getText());
                field1.setText(field1.getText().trim() + divSymbol);
                System.out.println("First value: "+ valOne);
            }
            
            if(e.getSource()==exp)
            {
                System.out.println("^");
                valOne = Integer.parseInt(field1.getText());
                field1.setText(field1.getText().trim() + expSymbol);
                System.out.println("First value: "+ valOne);
            }
            
            if(e.getSource()==equal)
            {
                System.out.println("=");
                String ints = field1.getText();
                System.out.println("ints: "+ ints);
                
                if(ints.contains("+"))
                {
                    String value = ints.substring(ints.lastIndexOf("+") + 1);
                    valTwo = Integer.parseInt(value);
                    System.out.println("Second value "+ valTwo);
                    answer = valOne + valTwo;
                    System.out.println(answer);
                    field1.setText(field1.getText() + " = "+ answer);
                }
                else if(ints.contains("-"))
                {
                    String value = ints.substring(ints.lastIndexOf("-") + 1);
                    valTwo = Integer.parseInt(value);
                    System.out.println("Second value: "+ valTwo);
                    answer = valOne - valTwo;
                    System.out.println(answer);
                    field1.setText(field1.getText() + " = " + answer);
                }
                else if(ints.contains("*"))
                {
                    String value = ints.substring(ints.lastIndexOf("*") +1);
                    valTwo = Integer.parseInt(value);
                    System.out.println("Second value: "+ valTwo);
                    answer = valOne * valTwo;
                    System.out.println(answer);
                    field1.setText(field1.getText() + " = " + answer);
                }
                else if(ints.contains("/"))
                {
                    String value = ints.substring(ints.lastIndexOf("/") + 1);
                    valTwo = Integer.parseInt(value);
                    System.out.println("Second value: "+ valTwo);
                    answer = valOne / valTwo;
                    System.out.println(answer);
                    field1.setText(field1.getText() + " = "+ answer);
                }
                else if(ints.contains("^"))
                {
                    String value = ints.substring(ints.lastIndexOf("^") + 1);
                    valTwo = Integer.parseInt(value);
                    System.out.println("Second value: " + valTwo);
                    answer = (int)Math.pow(valOne, valTwo);
                    System.out.println(answer);
                    field1.setText(field1.getText() + " = " + answer);
                }
            }
            else if(e.getSource()==clear)
            {
                field1.setText("");
                valOne = 0;
                valTwo = 0;
            }
            else if(e.getSource()==memOne)
            {
                memRec = answer;
            }
            else if(e.getSource()==memOneRec)
            {
                String mem = Integer.toString(memRec);
                field1.setText(field1.getText() + mem);
                JOptionPane.showMessageDialog(null, "You have recalled the value: "+ mem +" from memory.", "Memory Recall", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}