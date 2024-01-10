#include<stdio.h>
int a[100000],b[100000];
void main(){
    for(int i=0;i<100001;i++){
        a[i]=0;
        b[i]=0;
    }
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++){
        scanf("%d",&b[i]);
    }
    int sum=0;
    sum=a[0]-b[0];
    printf("sum = %d\n",sum);
    int j=0,k=0;
    for(;;){
        if(sum>0){ //  1 win
            printf("1\n");
            k++;//k=1
            sum-=b[k];
        }else if(sum<0){ // 2 win
            printf("2\n");
            j++;
            sum+=a[j];
        }else{// draw
            printf("0\n");
            j++;
            k++;
            sum+=a[j]-b[k];
        }
        if(a[j]==0||b[k]==0){
            break;
        }
        printf("sum = %d\n",sum);
    }
}
