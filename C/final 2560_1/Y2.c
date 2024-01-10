#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int value;
    if(n%2==0){
        value=n-1;
    }
    else{
        value=n-2;
    }
    for(int r=0;r<=n;r++){
        //top
        if(r<n/2){
            //top left space
            for(int c=0;c<r;c++){
                printf(" ");
            }
            //top left value
            printf("%d",r);

    //-------------------------------

            //top right space
            for(int c1=0;c1<value;c1++){
                printf(" ");
            }
            //top right value
            printf("%d",r);
            //space -2 every row
            value-=2;
            printf("\n");
        }
        else{
            for(int c=0;c<n/2;c++){
                printf(" ");
            }
            printf("%d\n",r);
        }

    }
}

