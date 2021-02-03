package com.example.calculator.factorial;

public class Nilu {

    public static int nSum(int value)
    {
        int sum=0;
        for(int i=0;i<=value;i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static long nFactorial(long value)
    {
        long sum=1;
        if(value==0)
        {
            return 1;
        }
        else
        {
            for(long i=1;i<=value;i++)
            {
                sum*=i;
            }
        }
        return sum;
    }
    public static int nFibonacci(int value)
    {
        int oldValue=0;
        int newValue=1;
        int sum=0;
        if(value==0)
        {
            return 0;
        }
        else if(value==1 || value==2)
        {
            return 1;
        }
        else
        {
            for(int i=2;i<=value;i++)
            {
                sum=(newValue+oldValue);
                if(i==value)
                {
                    return sum;
                }
                else
                {
                    oldValue=newValue;
                    newValue=sum;
                }
            }
        }
        return sum;
    }

    public static double square(int value)
    {

        return Math.sqrt(value);
    }

}
