public class Hello
{
    public static void main(String args[])
    {
        int num1 = 100, num2 = 2;
        byte num3 = 127;
        int num4 = num3+10; //conversion (implicit type casting)
        short num5 = (short)++num4; //casting (explicity type casting)

        Integer num = num1+55;
        //System.out.println(num.toString());

        String s = "string";
        String s1 = "string";

        boolean b = s.equals(s1);
        System.out.println(b);
        // System.out.println(num1 + num2);
        // System.out.println(num3);
        // System.out.println(num4);
        // System.out.println(num5);

        int x=15, y=6, z=3;

        // if(x>y)
        // {
        //     System.out.println(x);
        // }
        // else if(x>z)
        // {
        //     System.out.println(x+z);
        // }

        // String result = x>9 ? "x is greater": "y is greater";
        // System.out.println(result);

        // switch(x)
        // {
        //     case (10): 
        //         System.out.println("Monday");
        //     case (11): 
        //         System.out.println("Tuesday");
        //         break;
        //     case (12): 
        //         System.out.println("Wednesday");
        //         break;
        //     case (13): 
        //         System.out.println("Thrusday");
        //         break;
        //     default: 
        //         System.out.println("Enter a valid number");
        // }

        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                //System.out.println("i " + i + ", j " + j);
            }
        }

        // System.out.println(a);
        // System.out.println(b);
    }
}