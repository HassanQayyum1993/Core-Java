import java.io.Console;

public class Main
{
    public static void main(String args[])
    {
        A a = new A()
        { // anonymous inner class
            public void show1()
            {
                System.out.println("This is anonymous inner class");
            }
        };

        B.print();
        
    }
}

class A
{
    public void show1()
    {
        System.out.println("This is A class");
    }

    public static void print()
    {
        System.out.println("print A");
    }
}

class B extends A
{
}


// abstract class A
// {
//     abstract void show1();
// }


// class B extends A
// {
//     public void show1()
//     {
//         System.out.println("This is class B");
//     }
// }

