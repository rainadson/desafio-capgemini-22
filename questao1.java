package com.desafiocap;

import javax.swing.JOptionPane;


public class App 
{
       
    public static void main( String[] args )
    {
       String d = JOptionPane.showInputDialog( "Digite a quantidade de vezes: " );
       Integer n = Integer.valueOf(d);
       for(int i = 0 ;i < n;i++){
            System.out.println("".repeat(n - 1) + "*".repeat(i + 1));
       } 
      

}}

 


