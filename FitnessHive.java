/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesshive;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class FitnessHive {

   
    public static void main(String[] args) throws IOException {
      Client client;
        Scanner input=new Scanner(System.in);
        
       
        File ClientFile=new File("client.txt");
        
        FileWriter writer=new FileWriter(ClientFile,true);
        PrintWriter pwriter=new PrintWriter(writer,true);
        // Create a new PrintWriter object with autoflush enabled
         
         
       
        System.out.println("----------------------------");
        System.out.println("Welcome to the Fitness hive!");
        System.out.println("----------------------------");
        System.out.println("Enter your Name:");
        String name=input.next();
        
           
        System.out.println("Enter your ID:");
        int id = input.nextInt();  
       
        System.out.println("Enter your Phone Number:");
        String phone = input.next();
         
         
        System.out.println("Enter your Email address:");
        String email = input.next();
       
        System.out.println("Enter your username:");
        String username = input.next();
     
        System.out.println("Enter your password:");
        String password = input.next();
       
        System.out.println("Are you Male or Female:");
        String gender=input.next();
       
        System.out.println("Enter your Age:");
        int age=input.nextInt();
         
        System.out.println("Enter your Height in cm:");
        double height=input.nextDouble();
        pwriter.println("Height:"+ height);
          
        System.out.println("Enter your Weight in kg :");
        double weight=input.nextDouble();
        
        System.out.println("Choose your Goal of subscription:");
        System.out.println("1: Lose weight");
        System.out.println("2: Gain weight");
        System.out.println("3: Enhance Physical Fitness");
        int goal = input.nextInt();
      
        // Create a new Client object with the user's input
        client = new Client (name,id, phone, email, username, password, age,
        gender, height,weight, goal,0.0);
        // Set the fitness goal on the client object
        client.setGoal(goal);
      
        // create variable to hold bmi calculation 
        double bmi=Math.round(client.setBmi(height, weight)); 
        client.makeSubscrption();
          System.out.println(client.choose_schedule());
        client.DisplyClientInfo(bmi);
       
         
        // Use the client object's getter methods to display the client information
        pwriter.println("Name: " + client.getName());
        pwriter.println("Id Number: " + client.getId());
        pwriter.println("Phone Number: " + client.getPhone());
        pwriter.println("Email address: " + client.getEmail());
        pwriter.println("Username: " + client.getUsername());   
        pwriter.println("Password: " + client.getPassword()); 
        pwriter.println("Sex: " + client.getGender());   
        pwriter.println("Age: " + client.getAge()); 
        pwriter.println("Height: " + client.getHeight() + " m");     
        pwriter.println("Weight: " + client.getWeight() + " kg");
        pwriter.println("BMI:"+ bmi +client.getBMI());     
        pwriter.println("Fitness Goal: " + client.getGoal(goal));

        System.out.println("----------THANK YOU FOR CHOOSING FITNESS HIVE !!--------------"); 
        pwriter.flush();
        pwriter.close();
    }
          
     
  
    
    
    
    
    
        
}
    
   
    

