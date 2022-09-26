package Labcode;

	import java.util.Scanner;
	import java.util.Date;

		public class Employee 
		{
			
			String firstname,lastname;
			Employee(String firstname,String lastname)
			{
				this.firstname=firstname;
				this.lastname=lastname;
			}// parameterized constructor

			public static void main(String[] args)
			{
				String c1 = null;
				CredentialService cs = new CredentialService();
				Scanner ins = new Scanner(System.in);
				
				System.out.println("Enter your first name");
				String firstname = ins.nextLine();
				System.out.println("Enter your last name");
				String lastname = ins.nextLine();
				System.out.println("choose your department name \n 1.Technical \n 2.Admin \n 3.Human Resource \n 4.Legal");
				int dept = ins.nextInt();
				switch(dept) {
				case 1:
					 c1="tech";
						break;
				case 2:
					c1="admin";
						break;
				case 3:
					c1="hr";
						break;
				case 4:
					c1="legal";
						break;
				default:System.out.println("Enter the valid option");
						break;
				}//switch case 
				
				cs.generateEmailAddress(firstname,lastname,c1);
				
		}// main

		
	}// class



