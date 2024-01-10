#include<stdio.h>
#include<limits.h>
struct{
    int number[1001];
}typedef sth;

sth arr[1000];
void main()
{
    int n;
    scanf("%d",&n);
    for(int i=0;i<1000;i++){
        for(int j=0;j<1001;j++){
            arr[i].number[j]=1002;
        }
    }

    int k;
    for(int i=1;i<=n;i++){
        scanf("%d",&k);
        for(int j=0;j<k;j++){
            scanf("%d",&arr[i].number[j]);
        }
    }
    int a,p;
    int countError=0;
    int sum=0;
    int max=INT_MIN,min=INT_MAX;
    for(;;){
        scanf("%d",&a);
        if(a==0){
            break;
        }
        scanf("%d",&p);
        if(arr[a].number[p]!=1002){
            if(arr[a].number[p]>max){
                max=arr[a].number[p];
            }
            if(arr[a].number[p]<min){
                min=arr[a].number[p];
            }
            sum+=arr[a].number[p];
        }
        else if(arr[a].number[p]==1002){ //error
            countError++;
        }
    }
    /*printf("sum : %d\n",sum);
    printf("max : %d\n",max);
    printf("min : %d\n",min);
    printf("Error : %d\n",countError);*/
    //
    printf("%d\n",sum);
    printf("%d\n",max);
    printf("%d\n",min);
    printf("%d",countError);
}

