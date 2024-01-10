#include<stdio.h>
int arr[1000000];
void main()
{
    int counta=0;
    int count=0;
    while(1){
        int x;
        scanf("%d",&x);
        if(x<=0){
            break;
        }
        count++;
        if(counta==0){  //1
            arr[0]=x;   //1st
            counta++;
        }
        else{
            int check=0;
            for(int i=0;i<counta;i++){
                if(x==arr[i]){
                    check++;
                }
            }
            if(check==0){
                arr[counta]=x;
                counta++;
            }
        }
    }
    printf("%d\n",count);
    printf("%d\n",counta);
    for(int i=0;i<counta;i++){
        printf("%d ",arr[i]);
    }
}
