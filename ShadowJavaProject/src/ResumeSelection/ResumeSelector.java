package ResumeSelection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

//a)	Develop a solution to check for presence of certain keywords in a resume (PDF|MSWORD) and provide %age match for further consideration.
public class ResumeSelector {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the required Skills to be found");
	      String skill = sc.next();
	      boolean flag = false;
	      int count = 0;
	      System.out.println("Contents of the line");
	      
	      Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\Senior Software Engineer Resume.doc"));
	      while(sc2.hasNextLine()) 
	      {
	         String line = sc2.nextLine();
	         //System.out.println(line);
	         if(line.indexOf(skill)!=-1) 
	         {
	            flag = true;
	            count = count+1;
	         }
	      }
	      if(flag) 
	      {
	         System.out.println("Selected Resume contains the required Skill");
	         System.out.println("Number of occurrences is: "+count);
	         if(count>=1)
	         {
	        	 System.out.println("This resume matches with the required skill- 100%");
	         }
	         else
	         {
	        	 System.out.println("This resume does not match with the skill - 0%");
	         }
	      } 
	      else 
	      {
	         System.out.println("Selected Resume does not contain the required Skill");
	      }
}
}