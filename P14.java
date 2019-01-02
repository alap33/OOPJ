//using string class
package javaapplication14;

import java.util.Scanner;

public class P14 {
    
   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.nextLine();
        String s2="";
        int l=s1.length();
        for(int i=(l-1);i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2)) 
        {
            System.out.println("Palindrme");
        }
        
        else 
        {
            System.out.println("not Palindrome");
        }

    }
    
}
