#include <stdio.h>
#include <stdlib.h>
// 레퍼런스
int main() {
    int age = 20;
    printf("age = %d\n", age);      // age = 20

    int* pAge = malloc(4);          // 4바이트 int 메모리를 확보하고
    *pAge = 200;                    //p는 주소를 저장하는 변수, 포인터 변수 // 주소로 가서 값을 바꿔
    
    printf("age = %d\n", *pAge);    // age = 200

    printf("age = %d\n", age);      // age = 20

    return 0;
}
