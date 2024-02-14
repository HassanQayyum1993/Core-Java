
public class Main
{
    public static void main(String[] args) {

        A a = (i,j) -> i+j;
        System.out.println(a.Sum(5,8));
    }
}

@FunctionalInterface
interface A
{
    int Sum(int a, int b);
}

@FunctionalInterface
interface C
{
    void printC();
}

class B implements A,C
{
    @Override
    public int Sum(int a, int b)
    {
        return a+b;
    }

    @Override
    public void printC()
    {
        System.out.println("from class C");
    }
}

