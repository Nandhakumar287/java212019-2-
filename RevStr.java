import java.io.*;
import java.util.*;
  public class RevStr{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Input String Size:");
      int size=sc.nextInt();
      System.out.println("Enter Input string:");
      String str=sc.next();
        if(size==str.length())
        {
          for(int i=str.length();i>0;i--)
          {
            if(str.charAt(i-1)=='A' || str.charAt(i-1)=='E'||
            str.charAt(i-1)=='I'||str.charAt(i-1)=='O'||
            str.charAt(i-1)=='U')
            {
              System.out.print(" ");
            }
            else
            {
              System.out.print(str.charAt(i-1));
            }
          }
        }
        else
        {
          System.out.println("String Size Is Varied from Given Size");
        }
     }
   }  
            
