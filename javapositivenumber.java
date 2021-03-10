import java.util.Scanner;

public class javapositivenumber {

    public static void main(String[] args){
 
        int a;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number =>");
        a=sc.nextInt();

        if(a>0)
        {
            System.out.println(a + " is positive" );
        }
        else if(a<0)
        {
            System.out.println(a + " is negative");
        }
        else
        {
            System.out.println("No is 0");
        }
        
    }


    
}
