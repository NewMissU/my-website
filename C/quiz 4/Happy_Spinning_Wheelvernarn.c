#include<stdio.h>
void main(){
    int N ;
    scanf("%d",&N);
    int arr[N];
    for(int i=0;i<N;i++){
        scanf("%d",&arr[i]);
    }
    int S,R;
    scanf("%d %d",&S,&R);
    int a = ((S+R)%N);
    if(a==0){
        a=N-1;
    }
    else{
        a--;
    }
    printf("%d",arr[a]);
}

