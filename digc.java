import java.util.Scanner;
class digc{

  public static void main(String arg[])
  {int sum=0;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    while(n>0)
    {
     sum=sum+1;
      n=n/10;

    }
    System.out.println("Total number of digits are "+sum);
  }
}

