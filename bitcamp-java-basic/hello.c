// 헤더 파일
// 실제 함수의 몸체는 있다고 가정하고 컴파일 한 다음에 stdio.h에 있는 함수 몸체 파일을 가져와서 결합을 시켜서(linking) 최종 실행파일 만듦. 
// 컴파일한 것을 다른 파일과 링킹해서 한 덩어리로 만든 다음에 실행 파일을 만들어냄
// 자바는 링킹 없음
// 각각의 클래스파일 찾아 쓰고 없으면 class not found exception이 뜰 뿐임

#include <stdio.h>
#include <stdlib.h>

// function prototype
// 실제 함수가 아니라 미리 함수를 소개하는 것
void f1(int);
void f2(int*);
// void f2(int* p); 이렇게 해도 된다.

int main() {
  int a = 200;
  f1(a);
  printf("a = %d\n", a); // printf에 대한 함수 몸체가 stdlib에 들어 있다.
  //malloc도 마찬가지
  
  f2(&a);	//a라는 메모리의 주소
  printf("a = %d\n", a);
  return 0;
}

void f1(int a) {
  a = 100;
}

void f2(int* p) {
  *p = 100;
}

