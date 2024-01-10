#include<stdio.h>
//#include<limits.h>
void main()
{
    int x,i=0,max=0,min=0; //กำหนดค่าสูงสุดให้เป้น 0 เพราะ ถ้าให้ค่ามากๆ เลขทั้งหมดอาจจะไม่มากกว่า max
    //max = INT_MIN INT_MAX = lowest integer value
    while (i<8){
        scanf("%d",&x);
        if(x>0){ // positive เอาเลขบวก มาพิจารณา อะไรมากสุด เช่น 7 3 2 5 20
            if(x>max){      // 7>0 ไหม ใช่      3>7 ไหม ไม่     20 > 7 ไหม ใช่ ดังนั้น max = 20 มันจะเทียบเลขทีละคู่ จึงต้องมีตัวแปรเก็บค่าสูงสุด
                max = x;
            }
            if(x<min){
                min = x;
            }
        }
        i++;
    }
    printf("Max : %d\n",max);
    printf("Min : %d\n",min);
}
