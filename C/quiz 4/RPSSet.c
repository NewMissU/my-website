#include<stdio.h>
void main()
{
    int countx=0,county=0;
    int n;
    scanf("%d",&n);
    int x[n],y[n];
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    for(int i=0;i<n;i++){
        scanf("%d",&y[i]);
    }
    for(int i=0;i<n;i++){
        if(x[i]==1 && y[i]==1){

        }
        else if(x[i]==1 && y[i]==2){
            county++;
        }
        else if(x[i]==1 && y[i]==3){
            countx++;
        }
        else if(x[i]==2 && y[i]==1){
            countx++;
        }
        else if(x[i]==2 && y[i]==2){

        }
        else if(x[i]==2 && y[i]==3){
            county++;
        }
        else if(x[i]==3 && y[i]==1){
            county++;
        }
        else if(x[i]==3 && y[i]==2){
            countx++;
        }
        else if(x[i]==3 && y[i]==3){

        }
        //printf("%d %d",countx,county);
    }
    printf("%d %d\n",countx,county);
    if(countx>county){
        printf("1");
    }
    else if(countx<county){
        printf("2");
    }
    else if(countx==county){
        printf("0");
    }
}
