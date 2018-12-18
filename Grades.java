import java.util.Scanner; // Yishai Baron 308396761

public class Grades 
{
   private static Scanner scan;

public static void main(String[] args)
   {

    scan = new Scanner(System.in); 

    	int grade, exam, count = 0, sum = 0;
  
      
    
System.out.println("Welcome to grades calculator.");
      System.out.println("Enter grade of ex1: ");
                grade = scan.nextInt();   
                if (grade >= 0)   
                {   
                   count++;   
                   sum += grade;    
                }

      System.out.print("Enter grade of ex2 ");
                grade = scan.nextInt();
               
                 if (grade >= 0)   
                {   
                   count++;   
                   sum += grade; } 
      System.out.print("Enter grade of ex3: ");
                grade = scan.nextInt();
                if (grade >= 0)   
                {   
                   count++;   
                   sum += grade;   
                }
      System.out.print("Enter grade of ex4: ");
                
      grade = scan.nextInt();
       if (grade >= 0)   
                {   
                   count++;   
                   sum += grade;   
                }

      System.out.print("Enter grade of ex5: ");
                grade = scan.nextInt();
                 if (grade >= 0)   
       
                {   
                   count++;   
                   sum += grade;   
                }     
      System.out.print("Enter grade of exam: ");
                exam = scan.nextInt();
                
                double z = (sum*0.05+exam*0.85);
                double x = (sum*0.05+exam*0.8);
                double y = (sum*0.05+exam*0.75);

   
              
                if (count <= 2)   {
                    System.out.println ("The final grade is: 0");   }
                else if (count == 3) {
                	System.out.println("The final grade is: "+ z); }
                else if (count == 4) {
             	   System.out.println("The final grade is: " +x); }      
                else if (count == 5) {
              	   System.out.println("The final grade is: " +y); }    
         
         
}
   }
             
               