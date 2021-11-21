
package assignment4;
import java.util.Scanner;


public class Assignment4 {

    
    public static void main(String[] args) {
        
        
        Scanner input=new Scanner (System.in);
        System.out.println("enter saff type");
        String type=input.nextLine();
        
         memberFactory membertype =new  memberFactory();
        staff s=membertype.getmember(type);
        System.out.println("enter salary");
        double salary =input.nextDouble();
        System.out.println("enter years");
        double years=input.nextDouble();
        Doctor d= new Doctor();
        d.setsalary(  salary);
        d.setyearsofwork( years);
        TeacherAssistant t= new TeacherAssistant();
         t.setsalary(  salary);
        t.setyearsofwork( years);
         System.out.println (s.getYearsofWork());
            System.out.println (s.getsalary());
    }
    
}
