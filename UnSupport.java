package com.company;

public class UnSupport
{
  public static void main(String args[])
  {
      try
      {
          int num1 = 6;
          int num2 = 0;
          int result = num1 / num2;
          System.out.println("result = " + result);
      }
      catch(ArithmeticException e)
      {
          System.out.println("unsupported operation exception");
      }
  }
}
