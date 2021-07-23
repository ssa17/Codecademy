/*
this is a calculator I've built
it can add, subtract, multiply, divide and find modulo.
*/
public class Calculator {
  public Calculator(){

  }
    //add numbers
  public int add(int num1, int num2){
    return num1 + num2;
  }
//subtract numbers
  public int subtract(int num1, int num2){
    return num1 - num2;
  }
  //multiply numbers
  public int multiply(int num1, int num2){
    return num1 * num2;
  }
  //divide numbers
  public int divide(int num1, int num2){
    return num1 / num2;
  }
  //modulo on numbers
  public int modulo(int num1, int num2){
    return num1 % num2;
  }
  
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
  }
}
