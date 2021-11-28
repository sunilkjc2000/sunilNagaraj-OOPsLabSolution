package com.admin.main;
import java.util.Scanner;
import com.admin.service.Adminservice;

public class Adminmain {
    
	public static void main(String args[])
	{
		
	    String departments = "1. Technicals\n2. Admin\n3. Human Resource\n4. Legal\n5. Exit";
	    Scanner scan = new Scanner(System.in);
	    String firstName = new String();
	    String lastName = new String();
	    int option = 5;
	    
	    do
		{
		    // Get user info
	    	System.out.print("\n\nEnter First Name:");
		    firstName = scan.next();
		    System.out.print("Enter Lirst Name:");
		    lastName = scan.next();
		
	    	Adminservice adminsrc = new  Adminservice(firstName,lastName);
	    	// Get user options
	    	System.out.println(departments);
            option = scan.nextInt();

            // Set departments
            switch(option)
            {
            case 1:
            	adminsrc.setDepartment("tech");
            	break;
            case 2:
            	adminsrc.setDepartment("admin");
            	break;
            case 3:
            	adminsrc.setDepartment("humanres");
            	break;
            case 4:
            	adminsrc.setDepartment("legal");
            	break;
            case 5:
                 System.out.println("Exiting IT admin services");
                break;            
            }
            
            // Show credentials if admin do not want to exit
            if(option != 5)
                adminsrc.showCredentials();
		}while(option != 5);
	    
	    scan.close();
	}
}
