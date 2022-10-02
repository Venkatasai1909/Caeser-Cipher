package pack1;
import java.util.*;
public class CaeserCipherCode {
	//Source Code which takes Shift key s & displays decoded code from text//
	    public static StringBuffer encrypt(String text,int s)
	    {
	        StringBuffer result= new StringBuffer();
	        for (int i=0; i<text.length(); i++)
	        {
	            if (Character.isUpperCase(text.charAt(i)))
	            {
	                char ch = (char)(((int)text.charAt(i) +
	                                  s - 65) % 26 + 65);
	                result.append(ch);
	            }
	            else if(Character.isLowerCase(text.charAt(i)))
	            {
	                char ch = (char)(((int)text.charAt(i) +
	                                  s - 97) % 26 + 97);
	                result.append(ch);
	            }
	            else 
	            {
	            	int j = ((int)text.charAt(i));
	            	if(j>=48 && j<=57)
	            	{
	            		int ch =(((int)text.charAt(i) + s - 48) % 10 + 48);
	            		result.append((char)ch);
	            	}
	            	else
	            	{
	            		char k = (char)(((int)text.charAt(i)+s-33)%15+33);
	            		result.append(k);
	            	}	
	            }
	        }
	        return result;
	    }
	 // Driver code //
	    public static void main(String[] args)
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter how codes you wanna decode : ");
	    	int l = Integer.parseInt(sc.nextLine());
	        for(int i=0;i<=l;i++)
	        {
		    	System.out.println("******CAESER CIPHER******");
		    	System.out.println("Enter your code :"+(i+1));
		        String text = sc.nextLine();
		        System.out.println("Enter your shift key to decode");
		        int s = sc.nextInt();
		        System.out.println("Decode : "+encrypt(text,s));
	        }
	        sc.close();
	    }
}
