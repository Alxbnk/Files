import java.util.*;
import java.io.*;

public class readFile {

   private Scanner s;
   
   public void openFile(){
   
      try{
         s = new Scanner(new File("Deadpool"));
      }
      catch(Exception e){
         System.out.println("Could not find file");
      }
   }
   
   public void readFile(){
      while(s.hasNext()){
         String a = s.next();
         String b = s.next();
         String c = s.next();
         
         System.out.printf("%s %s %s\n", a, b, c);
      }
   }
   
   public void closeFile(){
      s.close();
   }
   
   
}