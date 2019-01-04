
package javaapplication6;


public class Extra_program {
       int num;
    Extra_program() {
        num=0;
    }

    Extra_program(int par) {
        num=par;
    }
    
     public Extra_program addob(Extra_program o1,Extra_program o2)
        {
           Extra_program o3 = new Extra_program();
             o3.num = o1.num +  o2.num;
            return o3;
        }
    public void display()
    {
        System.out.println(num);
    }
    
    

 
    public static void main(String[] args) {
        Extra_program o1 = new Extra_program(5);
        Extra_program o2 = new Extra_program(21);
        Extra_program o3 = new Extra_program();
        o3=o1.addob(o1,o2);
        o3.display();
        
    }
    
}