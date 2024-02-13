import java.io.Console;

class JaggedArray
{
    public static void main(String args[])
    {
        int arr[][][] = new int[2][][];

        arr[0] = new int[1][];
        arr[1] = new int[2][];
        arr[0][0] = new int[3];
        arr[1][0] = new int[4];
        arr[1][1] = new int[5];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    arr[i][j][k] = 0;
                }
            }
        }

        for(int i[][]: arr)
        {
            for(int j[]: i)
            {
                for(int k: j)
                {
                    System.out.print(k);
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}