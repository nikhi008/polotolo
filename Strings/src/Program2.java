import java.util.Scanner;

public class Program2
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		System.out.println("Given string is:-" +str);
		
		int vowels = 0,consonants = 0,spaces = 0,digits=0;
		
		 char ch[]=str.toCharArray();
		 int length=str.length();
		 
		 for(int i=0;i<length;i++)
		 {
			 if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' ||
			           ch[i]=='o' || ch[i]=='u' || ch[i]=='A' ||
			           ch[i]=='E' || ch[i]=='I' || ch[i]=='O' ||
			           ch[i]=='U')
			 {
				 vowels++;
			 }
			 else if((ch[i]>='a'&& ch[i]<='z') || (ch[i]>='A'&& ch[i]<='Z'))
		        {
		            ++consonants;
		        }
		        else if(ch[i]>='0' && ch[i]<='9')
		        {
		            ++digits;
		        }
		        else if (ch[i]==' ')
		        {
		            ++spaces;
		        }
		 }
		 
		 System.out.println(vowels);
		 System.out.println(consonants);
		 System.out.println(digits);
		 System.out.println(spaces);

	}

}
