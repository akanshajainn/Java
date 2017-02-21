import java.util.Scanner;

class lcm{
  public static void main(String arg[])
  {
	  int n1,n2,i,gcd=0,lcmn;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    n1=in.nextInt();
    n2=in.nextInt();
    for(i=1;i<=n1 && i<=n2; ++i)
    {
      if(n1%i==0 && n2%i==0)
          gcd=i;
    }
    lcmn=(n1*n2)/gcd;
    System.out.println("LCM is "+ lcmn);
  }
}
