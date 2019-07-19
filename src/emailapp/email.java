
package emailapp;

import java.util.Scanner;

public class email {
   private String firstName;
   private String lastName;
   private String email;
   private String password;
   private int defaultPasswordSize = 8;
   private String department;
   private int mailboxCapacity;
   private String alternateEmail;
   private String companySuffix = "company.com";
   
   // constructor to recieve first and last names
   public email (String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
       System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
       
       //Ask the user for the department and return it
       this.department = setDepartment();
       System.out.println("Department : " + this.department);
       
       // call a method that returns a random password
       this.password = generatePassword(defaultPasswordSize);
       System.out.println("Your password is " + this.password);
       
       //generate email
       email = generateEmail();
       System.out.println("Your email is: " + email);
            
   }
   
   //get department info
   private String setDepartment(){
       System.out.print("DEPARTMENT CODES\n 1 for Sales\n 2 for Development\n "
               + "3 for accounting\n 0 for none\n Enter the department code: ");
       Scanner in = new Scanner(System.in);
       int departmentChoice = in.nextInt();
       
       switch (departmentChoice) {
           case 1:
               return "sales";
           case 2:
               return "dev";
           case 3:
               return "acc";
           default:
               return"";        
        }
   }
   //generate a random password
   private String generatePassword(int length) {
       String passwordSet = "abcdefghijklmnopqrstuvwxyz1234567890!#$W@%";
       char[] password = new char[length];
       for (int i = 0; i<length; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
       }
       return new String(password);
   }
   
    //generate email
   private String generateEmail(){
       return (this.firstName + '.' + this.lastName + '@' + companySuffix);
   }
   //Set the mailbox capacity
   
   //Set the alternate email
   
   //Set the password
   
}
