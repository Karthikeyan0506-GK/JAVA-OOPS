class Calculator{
    public int add(int num1,int num2){
       return num1+num2;
    }
    public int mul(int num1,int num2){
       return num1*num2;
    }
   
   }
   
   public class Calculate{
   public static void main(String[] args) {
       Calculator calculator=new Calculator();
       int sum= calculator.add(50, 51);
       System.out.println("Sum:"+ sum);
       int mul=calculator.mul(50, 100);
       System.out.println("Mul:"+mul);
   
   }
   }
