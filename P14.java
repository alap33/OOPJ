/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class P14 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.nextLine();
        StringBuffer s2=new StringBuffer(s1);
        s2.reverse();
        if(s1.equals(s2.toString())) 
        {
            System.out.println("Palindrme");
        }
        
        else 
        {
            System.out.println("not Palindrome");
        }

    }