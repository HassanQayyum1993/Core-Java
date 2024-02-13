package Calc;

public class AdvanceCalc extends Calc {
    
    int power(int a, int b)
    {
        Calc c = new Calc();
        c.add(a, b);
        return (int) Math.pow((double)a, (double)b);
    }

    protected int add(int a, int b)
    {
        return a+2*b;
    }
}

class A
{
    A()
    {
        Calc c = new Calc();
        c.add(4,5);
    }
}