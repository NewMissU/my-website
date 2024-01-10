#include<stdio.h>
void main() //loop ต้องแยกประเด็นก่อน เรารู้รอบหรือไม่รู้รอบ ข้อนี้คือ รู้ จน. รอบ
{
//    printf("0\n"); ไม่ทำแบบนี้
//    printf("1\n");
//    printf("2\n");
//    printf("3\n");
    int i=0,n=19; // i = ตัวนับรอบ n=จน.รอบ
    while(i<=n){ //while(condition)
        printf("%d\n",i);   //เอาค่าตัวนับรอบมา พิมพ์ได้เลย
        i += 1; // i++, ++i
    }
}
