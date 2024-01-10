#include<stdio.h>
void main()
{
    int k;
    scanf("%d",&k);
    int arr[k][k];
    for(int r=0;r<k;r++){
        for(int c=0;c<k;c++){
            scanf("%d",&arr[r][c]);
        }
    }
//--------------------------------------------------------
    //calculate
    //middle
    int sum_Middle=arr[(k/2)][(k/2)];
    printf("%d\n",sum_Middle);

//--------------------------------------------------------
    //L1

    int sum_L1=0;
    for(int r=(k/2)-1;r<=(k/2)+1;r++){
        for(int c=(k/2)-1;c<=(k/2)+1;c++){
            //printf("%d ",arr[r][c]);
            sum_L1+=arr[r][c];
        }
    }
    //printf("\n");
    printf("%d\n",sum_L1-sum_Middle);

//--------------------------------------------------------
    //L2
    int sum_L2=0;
    for(int r=(k/2)-2;r<=(k/2)+2;r++){
        for(int c=(k/2)-2;c<=(k/2)+2;c++){
            //printf("%d ",arr[r][c]);
            sum_L2+=arr[r][c];
        }
    }
    //printf("\n");
    printf("%d\n",sum_L2-sum_L1);

//--------------------------------------------------------
    //L3
    int sum_L3=0;
    for(int r=(k/2)-3;r<=(k/2)+3;r++){
        for(int c=(k/2)-3;c<=(k/2)+3;c++){
            //printf("%d ",arr[r][c]);
            sum_L3+=arr[r][c];
        }
    }
    //printf("\n");
    printf("%d\n",sum_L3-sum_L2);
//--------------------------------------------------------


//จากที่ ทำมา จะเห็นว่า r และ c จะเป็น k/2+1 -1 ไปเรื่อยๆ ดังนั้นเราก็สร้าง i=0 i++ มา ลบเรื่อยๆ

}
