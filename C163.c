// 163번
// if 조건문 + 복합 대입 연산자 + 증감 연산자

#include <stdio.h>
int main(){
    int a = 10;

    if (a > 10) // F
        a += 5;
    else
        a -= 5;   // F : a=a-5 -> a=10-5 => a=5

    if (a == 15) // F
        ++a;
    else
        --a;    // F : a=5-1 => a=4 (전위 증감 연산자)

    printf("a=%d", a);  // a=4

    return 0;
}