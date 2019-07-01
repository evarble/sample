package math;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App
{
    public static class Calculator{
        public int Adder(int a, int b){
            return a+b;
        }
        int subtracter(int a, int b){
            return a-b;
        }
        int multiplier(int a, int b){
            return a*b;
        }
        double divider(int a, int b){
            return ((double)a/(double)b);
        }
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator calc = new Calculator();
        System.out.println("Output of adding:" + (calc.Adder(2,3)));
        System.out.println("Output of subtraction:" + (calc.subtracter(10,3)));
        System.out.println("Output of multiplier:" + (calc.multiplier(2,3)));
        System.out.println("Output of divider:" + (calc.divider(2,3)));
    }
}
