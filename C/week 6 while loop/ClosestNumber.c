#include<stdio.h>
#include<limits.h>
void main()
{
    int target, minDiff=INT_MAX, minDiff_x;
    scanf("%d",&target);
    int i=1,n=8;
    while (i<=n){
        int x;
        scanf("%d",&x);
        int diff;
        diff = x - target; // abs(x - target)
        if(diff<0){
            diff = -1*diff; // diff *= -1
        }
        if (diff < minDiff){ // minDiff
            minDiff = diff;
            minDiff_x = x;
        }
        printf("diff %d minDiff %d minDiff_x %d\n",diff,minDiff,minDiff_x);
        i++;
    }
    //printf("%d",minDiff_x);
}

/*
-7
7       7 - (-7) = 14
3       3 - (-7) = 10
-1     -1 - (-7) = 6
0
-10
2
5
20
*/
