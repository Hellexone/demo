import java.util.Scanner;

public class javamaxnumber {

    public static void main(String[] args){

        int a,b;

       Scanner sc=new Scanner(System.in);

      System.out.print("enter the value A =>");
      a=sc.nextInt();

      System.out.print("enter the value B =>");
      b=sc.nextInt();

      if(a>b)
      {
          System.out.println(a + " is greater");
      }
      else if(b>a)
      {
        System.out.println(b + " is greater");
      }
      else
      {
        System.out.println("both are equal");
      }

    }
    
}
