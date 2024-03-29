package com.lambton;
import java.util.Scanner;

public class ExceptionHandling
{
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        StudentClass s1=new StudentClass();
        System.out.println(s1.id());
        System.out.println(s1.NAMe());

        int a;
        System.out.println("Enter A");
        a=sc.nextInt();
        int b;
        System.out.println("Enter B");
        b=sc.nextInt();
        int[] x={1,2,3};
        int c;
        System.out.println("Start");
        try {

            c = a / b;
            System.out.println("C: "+c);
        }
        catch (ArithmeticException e)
        {

            System.out.println("can't Divide with Zero");
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Array Index out of bound");
        }
        catch (Exception E)
        {
            System.out.println(E.toString());
            System.out.println(E.getMessage());
        }
        finally {
            System.out.println("finally block");
        }


        System.out.println("End");
        s1=null;
        System.gc();

    }
    public void finalize()
    {
        System.out.println("Finalize");
    }
}
