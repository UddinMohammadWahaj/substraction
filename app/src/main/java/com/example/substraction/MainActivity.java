package com.example.substraction;

public class MainActivity
{
    static final int N=3;
    static void subtract(int A[][], int B[][], int C[][])
    {
        int i, j;
        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++)
                C[i][j] = A[i][j] - B[i][j];
    }

    // Driver code
    public static void main (String[] args)
    {
        int A[][] = { {4,5,6},
                {3,4,1},
                {1,2,3}};

        int B[][] = { {2,0,3},
                {2,3,1},
                {1,1,1}};

        // To store result
        int C[][]=new int[N][N];

        int i, j;
        subtract(A, B, C);

        System.out.print("Result matrix is \n");
        for (i = 0; i < N; i++)
        {
            for (j = 0; j < N; j++)
                System.out.print(C[i][j] + " ");
            System.out.print("\n");
        }
    }
}