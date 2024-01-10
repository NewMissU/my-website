#include<stdio.h>
void main()
{
    int i=1,n=8,sum_even=0,sum_odd=0;
    while (i<=n){
        int x;
        scanf("%d",&x);
        // even or odd --> accumulation
        if(x%2==0){ //even
            sum_even += x;
        }
        else{ //odd
            sum_odd += x;
        }
        i++;
    }
    // display
    if(sum_even>sum_odd){
        printf("even\n");
    }
    else if (sum_even<sum_odd){
        printf("odd\n");
    }
    else{
        printf("equal\n");
    }
    printf("%d\n%d", sum_even,sum_odd);
}
