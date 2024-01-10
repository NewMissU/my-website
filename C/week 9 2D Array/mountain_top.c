#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    int arr[n][n];
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            scanf("%d",&arr[r][c]);
        }
    }
    //center
    int npeak=0;
    for(int cenR=1;cenR<n-1;cenR++){        //ทำตั้งแต่ แถวที่ 1 จนถึง รองสุดท้าย
        for(int cenC=1;cenC<n-1;cenC++){    //ทำตั้งแต่ หลักที่ 1 จนถึง รองสุดท้าย
            //printf("certer %d,%d\n",cenR,cenC);

            //side area
            int count=0;
            for(int r=cenR-1;r<=cenR+1;r++){        //ทำตั้งแต่ แถวที่ 0 จนถึง สุดท้าย
                for(int c=cenC-1;c<=cenC+1;c++){    //ทำตั้งแต่ หลักที่ 0 จนถึง สุดท้าย
                    //printf("%d ",arr[r][c]);
                    if(arr[cenR][cenC]>arr[r][c]){  //check ค่ารอบๆ ตัวกลาง มากกว่าให้นับไว้แต่ถ้าไม่ก็ไม่ต้องนับ
                        count++;
                    }
                }
                //printf("\n");
            }
            if(count==8){   //ถ้ามากกว่า 8 ครั้ง แสดงว่า ค่าตัวกลางเป็นค่ามากสุด ดังนั้น จึงเป็น ยอด
                npeak++;    //นับยอดว่ามีทั้งหมดกี่ยอด
                //printf("%d %d %d\n",arr[cenR][cenC],cenR,cenC);
            }
        }
    }
    printf("%d\n",npeak);   //แสดงค่า จำนวนยอด

    // loop for print
    for(int cenR=1;cenR<n-1;cenR++){
        for(int cenC=1;cenC<n-1;cenC++){

            int count=0;
            for(int r=cenR-1;r<=cenR+1;r++){
                for(int c=cenC-1;c<=cenC+1;c++){
                    if(arr[cenR][cenC]>arr[r][c]){
                        count++;
                    }
                }
            }
            if(count==8){
                //npeak++;
                printf("%d %d %d\n",arr[cenR][cenC],cenR,cenC);
            }
        }
    }
}
