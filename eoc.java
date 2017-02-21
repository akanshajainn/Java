class eoc{
public static void main(String arg[])
{ int sume=0,sumo=0;
  for(int i=1;i<=1000;i++)
  {
    if(i%2==0)
    sume=sume+i;
    if(i%2==1)
    sumo=sumo+i;
  }
  System.out.println("Even numbers sum "+sume+" Odd numbers sum "+sumo);
}
}
