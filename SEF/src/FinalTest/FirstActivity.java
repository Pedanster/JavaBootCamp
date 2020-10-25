package FinalTest;

import java.util.Arrays;

 
public class FirstActivity{
    
    public static void main(String args[]){
       
        
        Employee1 employee[] = new Employee1[3];
       
        
        employee[0] = new Employee1();
        employee[0].setSalary(1000);
        employee[0].setName("Genry");
       
        employee[1] = new Employee1();
        employee[1].setSalary(2000);
        employee[1].setName("Nick");
       
        employee[2] = new Employee1();
        employee[2].setSalary(800);
        employee[2].setName("Alex");
        
               
        Arrays.sort(employee, new SalaryComparator());
        System.out.println("\n\nOrder of the employees after salary amount:");
       
        for(int i=0; i < employee.length; i++){
            System.out.println( "Employee " + (i+1) + " name: " + employee[i].getName() + "; Salary: " + employee[i].getSalary());
        }
    }
}

       
        
    
   
