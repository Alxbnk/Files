import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

   public static void main(String[] args)throws FileNotFoundException{
   
      Scanner scan = new Scanner(System.in);
      CreateFile create = new CreateFile();
      readFile readF = new readFile();
      
      System.out.println("What would you like to do? \n\n 1: Create Movie \n 2: ReadFile");
      int firstChoice = scan.nextInt();
      
      switch (firstChoice){
      
         case 1:
            create.createFile();
            break;
            
         case 2:
            readF.openFile();
            readF.readFile();
            readF.closeFile();
            break;
      }
      
   }
}