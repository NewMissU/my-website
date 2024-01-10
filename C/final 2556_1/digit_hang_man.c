#include<stdio.h>
void main()
{
    char c[12];
    for(int i=0;i<12;i++){
        c[i]='_';
    }

    int arr[12];
    for(int i=0;i<12;i++){
        scanf("%d",&arr[i]);
    }

    //find error
    int error[5];
    //clean array error
    for(int i=0;i<5;i++){
        error[i]=-1;
    }

    //print _ 1st row
    for(int j=0;j<12;j++){
        printf("%c ",c[j]);
    }
    printf("\n");

    int x[5];
    for(int i=0;i<5;i++){
        scanf("%d",&x[i]);
        int s=0;    // 0 = error
        for(int j=0;j<12;j++){
            if(x[i]==arr[j]){
                c[j]=48+x[i];   //48 = 0
                s=1;    //1 = no error
            }
            printf("%c ",c[j]);
        }
        if(s==0){   //error
            error[i]=x[i];
        }
        for(int k=0;k<5;k++){   // loop print value error
            if(error[k]!=-1){
                printf("%d ",error[k]);
            }
        }
        printf("\n");
    }

    int count=0;
    for(int i=0;i<12;i++){
        if(c[i]!='_'){
            count++;
        }
    }
    printf("%d",count);


}
