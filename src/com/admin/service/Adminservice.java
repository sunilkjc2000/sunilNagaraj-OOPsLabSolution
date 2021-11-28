package com.admin.service;

import java.util.Random;

//IT support admin service class
public class Adminservice {

	public Adminservice(String firstName, String lastname) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
	}

	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	private String lastname;
	private String department;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	static String company = "greatLearn";

	//Service routines
	
	//Generate password
	public String generatePassword()
	{
        String specialChars = "-/.^&*_!@%=+>)"; 
        String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String smallLetter = "abcdefghijklmnopqrstuvwxyz"; 
        String numbers = "0123456789"; 
        int length = 8; // password length

        Random random = new Random(); 

        char[] password = new char[length]; 

                
        for (int i = 0; i < length; i++) 
        { 
        	// Add two Capital letter
            password[i] = 
            		capLetter.charAt(random.nextInt(capLetter.length())); 
            i=i+1;
            password[i] = 
            		capLetter.charAt(random.nextInt(capLetter.length())); 
            i=i+1;
            
            //Add three small letter
            password[i] = 
            		smallLetter.charAt(random.nextInt(smallLetter.length())); 
            i=i+1;
            password[i] = 
            		smallLetter.charAt(random.nextInt(smallLetter.length())); 
            i=i+1;

            password[i] = 
            		smallLetter.charAt(random.nextInt(smallLetter.length())); 
            i=i+1;

            //Add two numbers
            password[i] = 
            		numbers.charAt(random.nextInt(numbers.length())); 
            i=i+1;
            password[i] = 
            	    numbers.charAt(random.nextInt(numbers.length())); 
            i=i+1;
            
            //Add a special char
            password[i] = 
            	    specialChars.charAt(random.nextInt(specialChars.length())); 
            i=i+1;             
        } 
        return (new String(password));		
	}

	// Create Email address
	public String generateEmailAddress()
	{
       return(getFirstName().toLowerCase()+getLastname().toLowerCase()+"@"+getDepartment().toLowerCase()+"."+this.company+".com");  
	}
	
	// Print credentials
	public void showCredentials()
	{
		System.out.print("Dear " + getFirstName() + "your generated credentials are as follows");
	    System.out.println("Email    ---> "+generateEmailAddress());
	    System.out.println("Password ---> "+generatePassword());
	}
}

