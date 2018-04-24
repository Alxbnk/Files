import java.util.*;
import java.io.*;
import java.lang.*;

public class CreateFile {

   Scanner cF = new Scanner(System.in);
   
   
   public void createFile()throws FileNotFoundException{

      System.out.println("Movie Title: ");
      String fileName = cF.next();
      final Formatter x;
      PrintStream pS = new PrintStream(fileName);
      
      try{
         x = new Formatter(fileName);
      } catch (Exception e){
         System.out.println("Error Creating File");
      }
      pS.println("Title: " + fileName);
      
      System.out.println("How many Actors? ");
      int actorCount = cF.nextInt();
         for (int i = 0;i<actorCount;i++){
            
            System.out.println(i + 1 + "." + " Actor: ");
            System.out.println("Firstname: ");
            String firstName = cF.next();
            System.out.println("Actor's Lastname: " + firstName);
            String lastName = cF.next();
            pS.println("Actor: " + firstName + " " + lastName);
            
         }
      
      
      System.out.println("What's the production year? ");
      int pY = cF.nextInt();
         pS.println("Production Year: " + pY);
         
   }




}