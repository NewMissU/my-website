#include<stdio.h>   //broken
//function
int isUnique_func(int* arr,int n)
{
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int isUnique=1;
    for(int j=0;j<n;j++){
        int count=0;
        int x = arr[j];
        for(int i=j+1;i<n;i++){
            //printf("%d vs %d : %d\n",x,arr[i],x==arr[i]);
            if(x==arr[i]){
                count++;
            }
            //printf("count = %d\n",count);
        }
        //printf("count = %d\n",count);
        if(count > 0){
            isUnique=0;
            break;
        }
    }
    return isUnique;
}

//main
void main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    int isUnique = isUnique_func(arr,n);
    printf("%d",isUnique);
}


