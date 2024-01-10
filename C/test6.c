#include<stdio.h>
void main()
{
    int A[3][4];
    int row;
    int col = 2;
    for(row = 0; row < 3; ++row)
    {
        int sum = col;
        for(col = 0; col < 4; ++col)
        {
            sum += row + col;
            A[row][col] = sum;
        }
    }
    printf("%d %d\n", A[0][3], A[1][0]);
    printf("%d %d\n", A[1][3], A[2][3]);
}
