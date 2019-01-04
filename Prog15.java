
package p15;

import java.util.Scanner;

public class P15 {

        String s;
        String s1[];
        
        P15(String str)
        {
            s=str;
        }
        public void sort()
        {
           int i;
           int j = 0;
           s1=s.split(" ");
           for(i=0;i<s1.length;i++)
           {
               
               for(i=j+1;j<s1.length;j++)
               {
                   if(s1[i].compareTo(s1[j])>0)
                   {
                       String t=s1[i];
                       s1[i]=s1[j];
                       s1[j]=t;
                   }
                   
               }
                  
             
           }
          
            for(i=0;i<s1.length;i++)
            {
                           System.out.println(s1[i]);
             }
        }
         public void count()
        {
         int c=0,i;   
            for(i=0;i<s1.length;i++)
            {
            if(s1[i].charAt(0)>=65 && s1[i].charAt(0)<=90)
              {
                  c++;
              }
             
            }
            System.out.println("count="+c);
        }  
           
       
    
    public static void main(String[] args){
        System.out.println("Enter string");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
P15 p=new P15(str);
p.sort();
p.count();   
}
}
