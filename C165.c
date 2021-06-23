// 165번
// 후위 증감 연산자

#include <stdio.h>
int main() {
    int a = 3;
    a += 1; // a=3+1 -> a=4

    printf("a=%d, ", a);    // a=4
    printf("a=%d, ", ++a);  // 전위 증감 연산자 : a=5
    printf("a=%d, ", a++);  // 후위 증감 연산자 : a=5
    printf("a=%d", a);    // 후위 증감 연산자 반영 : a=6

    // a=4, a=5, a=5, a=6

    return 0;
}