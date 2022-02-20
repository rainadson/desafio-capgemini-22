package com.projetocap;

import java.awt.HeadlessException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class App 
{
    public static boolean validaSenha(String senha) {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";
      
        Pattern p = Pattern.compile(regex);
      
      
        if(senha.length() < 6)
      
      {
      
      int sum = 6 - senha.length();
      
      System.out.print(sum);
      
      }
      
      
        Matcher m = p.matcher(senha);
      
        return m.matches();
      }
      
      public static void main(String[] args) {
      
        try (Scanner scanner1 = new Scanner(System.in)) {
          JOptionPane.showInputDialog("Senha");
          String senha = scanner1.next();
   
   
   
          System.out.println(validaSenha(senha));
        } catch (HeadlessException e) {
          
          e.printStackTrace();
        }
      }
}
