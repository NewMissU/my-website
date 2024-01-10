#include<stdio.h>
#include<limits.h>
void main()
{
    int n,m;
    scanf("%d",&n);
    scanf("%d",&m);
    int arr[m][n];
    int labor[n];

    int sum1=0,sum2=0,sum3=0,allsum=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&arr[i][j]);
            if(arr[i][j]>=10){
                arr[i][j]=10;
            }
            allsum+=arr[i][j]*40;
        }
    }
    printf("%d\n",allsum);
    //clean
    for(int i=0;i<n;i++){
        labor[i]=0;
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            labor[i]+=arr[j][i];
        }
        //printf("%d\n",labor[i]);
    }

    int max=INT_MIN,min=INT_MAX;
    int position_max=0,position_min=0;
    //loop check
    for(int i=0;i<n;i++){
        if(labor[i]>max){
            max=labor[i];
            position_max=i+1;
        }
        if(labor[i]<min){
            min=labor[i];
            position_min=i+1;
        }
    }
    //printf("max : %d\n",max);
    //printf("min : %d\n",min);
    printf("%d\n",position_max);
    printf("%d\n",position_min);

}
