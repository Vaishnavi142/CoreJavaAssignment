package ResumeSelection;
//a)	Develop a solution to check for presence of certain keywords in a resume (PDF|MSWORD) and provide %age match for further consideration.
import java.io.File;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ResumeSelector_PDF 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub				
		try
		{
	      File file = new File("C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\test-engineer Resume.pdf");
	      PDDocument document = Loader.loadPDF(file);	     
	      PDFTextStripper pdfStripper = new PDFTextStripper();	     
	      String text = pdfStripper.getText(document);
	      String Resume =text.toLowerCase();
	      System.out.println(text);
	    	  Set<String> keywords = new HashSet<String>();
	    	  keywords.add("cucumber");
	    	  keywords.add("java");
	    	  keywords.add("sql");
	    	  int count = 0;
	    	  for (String ele : keywords) 
	    	  {
	    	  if (Resume.contains(ele)) 
	    	  {
	    	  System.out.println("Required Skills Found in the Resume- "+ele);
	    	  count++;
	    	  }
	    	  }
	    	  if (count < 1) 
	    	  {
	    	  System.out.println("This resume does not match with the skills - 0%");
	    	  } else if (count == 1) 
	    	  {
	    	  System.out.println("This resume partially matches with the required skills - 50%");
	    	  } else if (count == 2) 
	    	  {
	    	  System.out.println("This resume matches with the required skills - 60%");
	    	  }
	    	  else if(count>2)
	    	  {
	    	  System.out.println("This resume matches with the required skills - 100%");
	    	  }
	    	  System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+keywords+ ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		catch(Exception e)
		{
			System.out.println("File not Found "+e);
		}
	}
	}


