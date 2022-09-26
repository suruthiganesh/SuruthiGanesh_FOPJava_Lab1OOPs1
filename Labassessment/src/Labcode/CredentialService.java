package Labcode;

import java.util.Date;

public class CredentialService {
	
	String mailid,firstname,timecon,pswd;
	String first = "2";
	int last = 4,totallength;
	public static final String[] UPPER = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	public static final String[] LOWER = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static final String[] SPLCHAR = {"!","@","#","$","%","^","&","*",".","(",")"};
	public static final String[] NUMBERS = {"1","2","3","4","5","6","7","8","9","0"};
	public static final String COMPANYNAME = "coders.com";
	String namelength;
	Long time;
	
	public String generateEmailAddress(String firstname,String lastname,String c1)
	{
		
		mailid = firstname + lastname + "@" + c1 + "." + COMPANYNAME;
		showCredentials(firstname,mailid,pswd);
		generatePassword(namelength,firstname,lastname);
		return firstname;
	}
	public String generatePassword(String namelength , String firstname, String lastname)
	{
		Date date= new Date();
		time = date.getTime();
        date = new Date(time);
        timecon=date+ "";
        String newlength = timecon.substring(17,19);
        String split1 = newlength.substring(0,1);
     
        String split2 = newlength.substring(1);
         Integer i=Integer.valueOf(split1);
        Integer j=Integer.valueOf(split2);
       
        
        
	    totallength = firstname.length() + lastname.length();
	   
	    if(totallength <=9)
	    {
	    	totallength = 10 + totallength;
	    }
	    namelength = String.valueOf(totallength);
	    String split3 = namelength.substring(0,1);
	    
	    String split4 = namelength.substring(1);
	   
	    Integer k=Integer.valueOf(split3);
	    Integer l=Integer.valueOf(split4);
        
        
        
	   
	    String password = UPPER[i] + SPLCHAR[j] + NUMBERS[k] + LOWER[l] + newlength + SPLCHAR[i] + split4;
	    System.out.println("password -->"  +password);
	    return password;
	    
	    }
	
	public String showCredentials(String firstname,String mailid,String password)
	{
		System.out.println("Dear " + firstname + " your generated credentials are as follows: \n");
		System.out.println("Email -->   " + mailid);
		//System.out.println("Password --> " + password);
		return null;
		
	}
	
}
