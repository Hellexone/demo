import java.util.Scanner;

public class javaoddeven {

    public static void main(String[] args){

        int a;

        Scanner sc=new Scanner(System.in);

        System.out.print("enter the value =>");
        a=sc.nextInt();

        if(a==0)
        {
          System.out.println(a + " is neutral");
        }
        else if(a%2==0)
        {
          System.out.println(a + " is even ");
        }
        else
        {
            System.out.println("is odd");
        }
    }

    
}
