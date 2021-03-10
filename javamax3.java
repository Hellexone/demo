import java.util.Scanner;

public class javamax3 {

    public static void main(String[] args){

    int english,computer,maths,total;

    Scanner sc=new Scanner(System.in);

    System.out.print("enter marks of english =>");
    english=sc.nextInt();
    
    System.out.print("enter marks of computer =>");
    computer=sc.nextInt();

    System.out.print("enter marks of maths =>");
    maths=sc.nextInt();

    total=english+computer+maths;

    System.out.println("total marks = " + total );

    if(total>0 && total<=50)
    {
        System.out.println("C grade");
    }
    else if(total>50 && total<100)
    {
        System.out.println("B grade");
    }
    else
    {
        System.out.println("A grade");
    }

    
}
}
