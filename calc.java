class operators{
  public void sum(int a, int b){
    int sum=a+b;
    System.out.println("Sum: "+sum);
  }
  public void diff(int a, int b){
    int diff=a-b;
    System.out.println("Difference: "+diff);
  }
  public void mul (int a, int b){
    int mul=a*b;
    System.out.println("Multiplication: "+mul);
  }
  public void div (int a, int b){
    int div= a/b;
    System.out.println("Division: "+div);
  }
}

class calc{
  public static void main(String[] args) {
    operators obj=new operators();
    int n1=5,n2=2;
    obj.sum(n1,n2);
    obj.diff(n1,n2);
    obj.mul(n1,n2);
    obj.div(n1,n2);
  }

}
