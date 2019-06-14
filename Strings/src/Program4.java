import java.io.IOException;
import java.util.Scanner;

public class Program4 
{
	void m() throws IOException{  
	    throw new java.io.IOException("device error");//checked exception  
	  }  
	  void n() throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	
	
	
	public static void main(String[] args) 
	{
		Program4 p=new Program4();
		p.p();

	}

}
